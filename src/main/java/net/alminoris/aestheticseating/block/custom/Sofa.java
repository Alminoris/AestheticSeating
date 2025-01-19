package net.alminoris.aestheticseating.block.custom;

import net.alminoris.aestheticseating.block.ModBlocks;
import net.alminoris.aestheticseating.item.ModItems;
import net.alminoris.aestheticseating.util.helper.VoxelShapeHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.StringIdentifiable;
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

public class Sofa extends SeatingFurniture
{
    private static final VoxelShape SEAT = Sofa.createCuboidShape(0.0D, 2.0D, 1.0D, 16.0D, 7.0D, 15.0D);

    private static final VoxelShape SEAT_NORMAL = Sofa.createCuboidShape(1.0D, 2.0D, 1.0D, 15.0D, 7.0D, 15.0D);

    private final String name;

    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public static final BooleanProperty CUSHION = BooleanProperty.of("cushion");

    public enum Variant implements StringIdentifiable
    {
        NORMAL("normal"),
        CENTER("center"),
        LEFT("left"),
        RIGHT("right"),
        LEFTCORNER("leftcorner"),
        RIGHTCORNER("rightcorner");

        private final String name;

        Variant(String name) { this.name = name; }

        @Override
        public String asString() { return this.name; }
    }

    public static final EnumProperty<Variant> VARIANT = EnumProperty.of("variant", Variant.class);

    public Sofa(String name)
    {
        super(Settings.copy(Blocks.BLACK_WOOL), -0.15D);
        this.name = name;
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(VARIANT, Variant.NORMAL).with(CUSHION, false));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx)
    {
        return this.getDefaultState().with(FACING, ctx.getPlayer().getHorizontalFacing());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, VARIANT, CUSHION);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        return getRotatedShape(state);
    }

    private VoxelShape getRotatedShape(BlockState state)
    {
        Direction direction = state.get(FACING);
        Variant variant = state.get(VARIANT);

        List<Box> boxes = new ArrayList<>();
        if (variant == Variant.NORMAL)
            boxes.add(SEAT_NORMAL.getBoundingBox());
        else
            boxes.add(SEAT.getBoundingBox());

        return VoxelShapeHelper.rotateShape(boxes, direction);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit)
    {
        boolean currentCushion = state.get(CUSHION);
        Variant currentVariant = state.get(VARIANT);
        Direction currentFacing = state.get(FACING);
        ItemStack stack = player.getStackInHand(hand);

        if (stack.getItem() == ModBlocks.CUSHIONS.get(name).asItem() && !currentCushion)
        {
            if (!world.isClient)
            {
                world.setBlockState(pos, state
                        .with(FACING, currentFacing)
                        .with(CUSHION, true)
                        .with(VARIANT, currentVariant));

                stack.decrement(1);
            }

            return ActionResult.SUCCESS;
        }

        if (stack.getItem() == ModItems.CUSHION_REMOVER && currentCushion)
        {
            if (!world.isClient)
            {
                world.setBlockState(pos, state
                        .with(FACING, currentFacing)
                        .with(CUSHION, false)
                        .with(VARIANT, currentVariant));

                if (stack.getDamage() < stack.getMaxDamage() - 1)
                    stack.setDamage(stack.getDamage() + 1);
                else
                    stack.decrement(1);

                ItemStack carpetStack = new ItemStack(ModBlocks.CUSHIONS.get(name));
                if (!player.getInventory().insertStack(carpetStack))
                    player.dropItem(carpetStack, false);
            }

            return ActionResult.SUCCESS;
        }

        return super.onUse(state, world, pos, player, hand, hit);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos)
    {
        return updateSofaVariant(world, state, pos);
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify)
    {
        super.onBlockAdded(state, world, pos, oldState, notify);
        updateSurroundingSofas(world, pos);
    }

    private void updateSurroundingSofas(World world, BlockPos pos)
    {
        for (Direction direction : Direction.Type.HORIZONTAL)
        {
            BlockPos neighborPos = pos.offset(direction);
            BlockState neighborState = world.getBlockState(neighborPos);

            if (neighborState.getBlock() instanceof Sofa)
            {
                BlockState updatedState = updateSofaVariant(world, neighborState, neighborPos);
                if (!neighborState.equals(updatedState))
                {
                    world.setBlockState(neighborPos, updatedState);
                }
            }
        }
    }

    private BlockState updateSofaVariant(WorldAccess world, BlockState state, BlockPos pos)
    {
        Direction facing = state.get(FACING);

        BlockPos leftPos = pos.offset(facing.rotateYCounterclockwise());
        BlockPos rightPos = pos.offset(facing.rotateYClockwise());

        boolean leftConnected = isSofa(world, leftPos, facing, Variant.RIGHTCORNER);
        boolean rightConnected = isSofa(world, rightPos, facing, Variant.LEFTCORNER);

        if (isSofaL(world, rightPos.offset(facing.rotateYCounterclockwise()).offset(facing.rotateYClockwise().rotateYClockwise()), facing))
        {
            return state.with(VARIANT, Variant.RIGHTCORNER);
        }
        else if (isSofaR(world, leftPos.offset(facing.rotateYClockwise()).offset(facing.rotateYCounterclockwise().rotateYCounterclockwise()), facing))
        {
            return state.with(VARIANT, Variant.LEFTCORNER);
        }
        else if (leftConnected && rightConnected)
        {
            return state.with(VARIANT, Variant.CENTER);
        }
        else if (leftConnected)
        {
            return state.with(VARIANT, Variant.RIGHT);
        }
        else if (rightConnected)
        {
            return state.with(VARIANT, Variant.LEFT);
        }
        else
        {
            return state.with(VARIANT, Variant.NORMAL);
        }
    }

    private boolean isSofa(WorldAccess world, BlockPos pos, Direction expectedFacing, Variant variant)
    {
        BlockState state = world.getBlockState(pos);

        return state.getBlock() instanceof Sofa && (state.get(FACING) == expectedFacing || state.get(VARIANT) == variant);
    }

    private boolean isSofaL(WorldAccess world, BlockPos pos, Direction expectedFacing)
    {
        BlockState state = world.getBlockState(pos);

        return state.getBlock() instanceof Sofa && state.get(FACING) == expectedFacing.rotateYClockwise();
    }

    private boolean isSofaR(WorldAccess world, BlockPos pos, Direction expectedFacing)
    {
        BlockState state = world.getBlockState(pos);

        return state.getBlock() instanceof Sofa && state.get(FACING) == expectedFacing.rotateYCounterclockwise();
    }
}