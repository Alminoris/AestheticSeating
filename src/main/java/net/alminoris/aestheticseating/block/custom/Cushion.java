package net.alminoris.aestheticseating.block.custom;

import net.alminoris.aestheticseating.entity.custom.SeatEntity;
import net.alminoris.aestheticseating.item.ModItems;
import net.alminoris.aestheticseating.util.helper.VoxelShapeHelper;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class Cushion extends Block
{
    private static final VoxelShape SEAT = Cushion.createCuboidShape(3.0D, 0.0D, 3.0D, 13.0D, 4.0D, 13.0D);

    public Cushion()
    {
        super(Settings.copy(Blocks.BLACK_WOOL));
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
                SeatEntity seat = SeatEntity.createOrReuse(world, pos, -0.25D);
                world.spawnEntity(seat);

                player.startRiding(seat, true);
            }
        }
        return ActionResult.SUCCESS;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        return SEAT;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state)
    {
        return BlockRenderType.MODEL;
    }
}
