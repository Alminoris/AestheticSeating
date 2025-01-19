package net.alminoris.aestheticseating.block.custom;

import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class Cushion extends SeatingFurniture
{
    private static final VoxelShape SEAT = Cushion.createCuboidShape(3.0D, 0.0D, 3.0D, 13.0D, 4.0D, 13.0D);

    public Cushion()
    {
        super(Settings.copy(Blocks.BLACK_WOOL), -0.35D);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        return SEAT;
    }
}
