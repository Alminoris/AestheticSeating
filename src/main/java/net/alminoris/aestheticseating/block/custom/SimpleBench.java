package net.alminoris.aestheticseating.block.custom;

import net.alminoris.aestheticseating.item.ModItems;
import net.alminoris.aestheticseating.util.helper.VoxelShapeHelper;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
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
import net.minecraft.world.WorldAccess;

import java.util.ArrayList;
import java.util.List;

public class SimpleBench extends SeatingFurniture
{
    private static final VoxelShape SEAT = SimpleBench.createCuboidShape(0, 0, 3, 16, 9, 13);

    public enum Variant implements StringIdentifiable
    {
        NORMAL("normal"),
        CENTER("center"),
        LEFT("left"),
        RIGHT("right");

        private final String name;

        Variant(String name) { this.name = name; }

        @Override
        public String asString() { return this.name; }
    }

    public static final EnumProperty<SimpleBench.Variant> VARIANT = EnumProperty.of("variant", SimpleBench.Variant.class);

    public static final BooleanProperty BACKREST = BooleanProperty.of("backrest");

    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    private final String name;

    public SimpleBench(String name)
    {
        super(Settings.copy(Blocks.OAK_PLANKS), -0.1D);
        this.name = name;
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(VARIANT, Variant.NORMAL).with(BACKREST, false));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx)
    {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, VARIANT, BACKREST);
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
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit)
    {
        Variant currentVariant = state.get(VARIANT);
        boolean currentBackrest = state.get(BACKREST);
        ItemStack stack = player.getStackInHand(hand);

        if (stack.isIn(ItemTags.AXES))
        {
            if (!world.isClient)
            {
                if (currentBackrest)
                {
                    currentBackrest = false;
                    if (stack.getDamage() < stack.getMaxDamage() - 1)
                        stack.setDamage(stack.getDamage() + 1);
                    else
                        stack.decrement(1);

                    Direction currentFacing = state.get(FACING);
                    world.setBlockState(pos, state
                            .with(FACING, currentFacing)
                            .with(VARIANT, currentVariant)
                            .with(BACKREST, currentBackrest));
                }
            }

            return ActionResult.SUCCESS;
        }

        if ((!currentBackrest) && (stack.getItem() == ModItems.WRENCH) && (Block.getBlockFromItem(player.getOffHandStack().getItem()) != null))
        {
            if (!world.isClient)
            {
                Block block = Block.getBlockFromItem(player.getOffHandStack().getItem());
                if (!checkForWrenching(Registries.BLOCK.getId(block).getPath()).isEmpty())
                {
                    String name = checkForWrenching(Registries.BLOCK.getId(block).getPath());

                    if (this.name.equals(name))
                    {
                        currentBackrest = true;
                        player.getOffHandStack().decrement(1);
                        if (stack.getDamage() < stack.getMaxDamage() - 1)
                            stack.setDamage(stack.getDamage() + 1);
                        else
                            stack.decrement(1);

                        Direction currentFacing = state.get(FACING);
                        world.setBlockState(pos, state
                                .with(FACING, currentFacing)
                                .with(VARIANT, currentVariant)
                                .with(BACKREST, currentBackrest));
                    }
                }
            }

            return ActionResult.SUCCESS;
        }

        return super.onUse(state, world, pos, player, hand, hit);
    }

    private String checkForWrenching(String name)
    {
        String[] nameArr = name.split("_");
        if (nameArr[0].equals("stripped"))
        {
            if (nameArr.length > 3)
                return nameArr[1] + "_" + nameArr[2];
            else
                return nameArr[1];
        }
        return "";
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos)
    {
        return updateBenchVariant(state, world, pos);
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify)
    {
        super.onBlockAdded(state, world, pos, oldState, notify);
        updateSurroundingBenches(world, pos);
    }

    private void updateSurroundingBenches(World world, BlockPos pos)
    {
        for (Direction direction : Direction.Type.HORIZONTAL)
        {
            BlockPos neighborPos = pos.offset(direction);
            BlockState neighborState = world.getBlockState(neighborPos);

            if (neighborState.getBlock() instanceof SimpleBench)
                world.setBlockState(neighborPos, updateBenchVariant(neighborState, world, neighborPos));
        }
    }

    private BlockState updateBenchVariant(BlockState state, WorldAccess world, BlockPos pos)
    {
        Direction facing = state.get(FACING);

        BlockPos leftPos = pos.offset(facing.rotateYCounterclockwise());
        BlockPos rightPos = pos.offset(facing.rotateYClockwise());

        boolean leftConnected = isBench(world, leftPos, facing);
        boolean rightConnected = isBench(world, rightPos, facing);

        if (leftConnected && rightConnected)
            return state.with(VARIANT, Variant.CENTER);
        else if (leftConnected)
            return state.with(VARIANT, Variant.RIGHT);
        else if (rightConnected)
            return state.with(VARIANT, Variant.LEFT);
        else
            return state.with(VARIANT, Variant.NORMAL);
    }

    private boolean isBench(WorldAccess world, BlockPos pos, Direction facing)
    {
        BlockState state = world.getBlockState(pos);
        return state.getBlock() instanceof SimpleBench && state.get(FACING) == facing;
    }
}