package net.alminoris.aestheticseating.block.custom;

import net.alminoris.aestheticseating.AestheticSeating;
import net.alminoris.aestheticseating.entity.custom.SeatEntity;
import net.alminoris.aestheticseating.item.ModItems;
import net.alminoris.aestheticseating.util.helper.VoxelShapeHelper;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class SimpleStool extends Block
{
    private static final VoxelShape SEAT = SimpleStool.createCuboidShape(3.2, 0, 3, 12.8, 8, 13);

    public enum CarpetColor implements StringIdentifiable
    {
        BLACK("black"),
        BROWN("brown"),
        GRAY("gray"),
        LIGHT_GRAY("light_gray"),
        WHITE("white"),
        RED("red"),
        ORANGE("orange"),
        YELLOW("yellow"),
        PURPLE("purple"),
        MAGENTA("magenta"),
        PINK("pink"),
        BLUE("blue"),
        CYAN("cyan"),
        LIGHT_BLUE("light_blue"),
        GREEN("green"),
        LIME("lime");

        private final String name;

        CarpetColor(String name) { this.name = name; }

        public static CarpetColor fromString(String name)
        {
            for (CarpetColor inside : CarpetColor.values())
            {
                if (inside.name.equalsIgnoreCase(name))
                    return inside;
            }
            throw new IllegalArgumentException("No enum constant for name: " + name);
        }

        @Override
        public String asString() { return this.name; }
    }

    public enum Form implements StringIdentifiable
    {
        NORMAL("normal"),
        LATTICEBACK("latticeback"),
        DESK("desk");

        private final String name;

        Form(String name) { this.name = name; }

        public static Form fromString(String name)
        {
            for (Form inside : Form.values())
            {
                if (inside.name.equalsIgnoreCase(name))
                    return inside;
            }
            throw new IllegalArgumentException("No enum constant for name: " + name);
        }

        @Override
        public String asString() { return this.name; }
    }

    public static final EnumProperty<Form> FORM = EnumProperty.of("form", Form.class);

    public static final EnumProperty<CarpetColor> CARPET_COLOR = EnumProperty.of("carpet_color", CarpetColor.class);

    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public static final BooleanProperty CARPETED = BooleanProperty.of("carpeted");

    private final String name;

    public SimpleStool(String name)
    {
        super(Settings.copy(Blocks.OAK_PLANKS));
        this.name = name;
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(FORM, Form.NORMAL).with(CARPETED, false).with(CARPET_COLOR, CarpetColor.BLACK));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx)
    {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, FORM, CARPETED, CARPET_COLOR);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit)
    {
        if (world.isClient)
        {
            return ActionResult.SUCCESS;
        }

        if (!player.hasVehicle()) {
            boolean seatExists = world.getEntitiesByClass(SeatEntity.class, new Box(pos), Entity::isAlive)
                    .stream().findFirst().isPresent();

            if (!seatExists) {
                SeatEntity seat = SeatEntity.createOrReuse(world, pos, 0.0D);
                world.spawnEntity(seat);

                player.startRiding(seat, true);
            }
        }
        return ActionResult.SUCCESS;
    }

    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit)
    {
        Form currentForm = state.get(FORM);
        boolean currentCarpeted = state.get(CARPETED);

        if (stack.isIn(ItemTags.WOOL_CARPETS) && !currentCarpeted)
        {
            if (!world.isClient)
            {
                Direction currentFacing = state.get(FACING);
                String colorName = Registries.ITEM.getId(stack.getItem()).getPath().split("_")[0];
                world.setBlockState(pos, state
                        .with(FACING, currentFacing)
                        .with(FORM, currentForm)
                        .with(CARPETED, true)
                        .with(CARPET_COLOR, CarpetColor.fromString(colorName)));

                stack.decrement(1);
            }

            return ItemActionResult.SUCCESS;
        }

        if (stack.isIn(ItemTags.AXES))
        {
            if (!world.isClient)
            {
                if (currentForm.asString().equals("desk") || currentForm.asString().equals("latticeback"))
                {
                    currentForm = Form.NORMAL;
                    if (stack.getDamage() < stack.getMaxDamage() - 1)
                        stack.setDamage(stack.getDamage() + 1);
                    else
                        stack.decrement(1);

                    Direction currentFacing = state.get(FACING);
                    CarpetColor currentCarpetColor = state.get(CARPET_COLOR);
                    world.setBlockState(pos, state
                            .with(FACING, currentFacing)
                            .with(FORM, currentForm)
                            .with(CARPETED, currentCarpeted)
                            .with(CARPET_COLOR, currentCarpetColor));
                }
            }

            return ItemActionResult.SUCCESS;
        }

        if ((stack.getItem() == ModItems.WRENCH) && (Block.getBlockFromItem(player.getOffHandStack().getItem()) != null))
        {
            if (!world.isClient)
            {
                Block block = Block.getBlockFromItem(player.getOffHandStack().getItem());
                if (!checkForWrenching(Registries.BLOCK.getId(block).getPath()).isEmpty())
                {
                    String[] name = checkForWrenching(Registries.BLOCK.getId(block).getPath()).split("/");

                    if (this.name.equals(name[0]))
                    {
                        currentForm = Form.fromString(name[1]);
                        player.getOffHandStack().decrement(1);
                        if (stack.getDamage() < stack.getMaxDamage() - 1)
                            stack.setDamage(stack.getDamage() + 1);
                        else
                            stack.decrement(1);

                        Direction currentFacing = state.get(FACING);
                        CarpetColor currentCarpetColor = state.get(CARPET_COLOR);
                        world.setBlockState(pos, state
                                .with(FACING, currentFacing)
                                .with(FORM, currentForm)
                                .with(CARPETED, currentCarpeted)
                                .with(CARPET_COLOR, currentCarpetColor));
                    }
                }
            }

            return ItemActionResult.SUCCESS;
        }

        if (stack.getItem() == ModItems.CUSHION_REMOVER)
        {
            if (!world.isClient)
            {
                Direction currentFacing = state.get(FACING);
                CarpetColor currentCarpetColor = state.get(CARPET_COLOR);
                String colorName = currentCarpetColor.asString();
                world.setBlockState(pos, state
                        .with(FACING, currentFacing)
                        .with(FORM, currentForm)
                        .with(CARPETED, false)
                        .with(CARPET_COLOR, currentCarpetColor));

                if (stack.getDamage() < stack.getMaxDamage() - 1)
                    stack.setDamage(stack.getDamage() + 1);
                else
                    stack.decrement(1);

                Item item = Registries.ITEM.get(Identifier.of("minecraft", colorName + "_carpet"));
                ItemStack carpetStack = new ItemStack(item);
                if (!player.getInventory().insertStack(carpetStack))
                    player.dropItem(carpetStack, false);
            }

            return ItemActionResult.SUCCESS;
        }

        return super.onUseWithItem(stack, state, world, pos, player, hand, hit);
    }

    private String checkForWrenching(String name)
    {
        String[] nameArr = name.split("_");
        String formRes;
        if (nameArr[0].equals("stripped"))
        {
            formRes = "/desk";
            if (nameArr.length > 3)
                return nameArr[1] + "_" + nameArr[2]+formRes;
            else
                return nameArr[1]+formRes;
        }
        else
        {
            formRes = "/latticeback";
            if (nameArr.length > 2)
            {
                if (nameArr[2].equals("log") || nameArr[2].equals("stem"))
                    return nameArr[0] + "_" + nameArr[1]+formRes;
            }
            else
            {
                if (nameArr[1].equals("log") || nameArr[1].equals("stem") || (nameArr[0].equals("bamboo") && nameArr[1].equals("block")))
                    return nameArr[0]+formRes;
            }
        }
        return "";
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        return getRotatedShape(state);
    }

    private VoxelShape getRotatedShape(BlockState state)
    {
        Direction direction = state.get(FACING);

        List<Box> boxes = new ArrayList<>();
        boxes.add(SEAT.getBoundingBox());

        return VoxelShapeHelper.rotateShape(boxes, direction);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state)
    {
        return BlockRenderType.MODEL;
    }
}
