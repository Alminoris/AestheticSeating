package net.alminoris.aestheticseating.block.custom;

import net.alminoris.aestheticseating.util.helper.VoxelShapeHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import java.util.ArrayList;
import java.util.List;

public class StoneBench extends SeatingFurniture
{
    private static final VoxelShape SEAT = StoneBench.createCuboidShape(0, 0, 3, 16, 9, 13);

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

    public static final EnumProperty<StoneBench.Variant> VARIANT = EnumProperty.of("variant", StoneBench.Variant.class);

    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public StoneBench()
    {
        super(Settings.copy(Blocks.OAK_PLANKS), 0.0D);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(VARIANT, Variant.NORMAL));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx)
    {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, VARIANT);
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
    protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos)
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

            if (neighborState.getBlock() instanceof StoneBench)
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
        return state.getBlock() instanceof StoneBench && state.get(FACING) == facing;
    }
}