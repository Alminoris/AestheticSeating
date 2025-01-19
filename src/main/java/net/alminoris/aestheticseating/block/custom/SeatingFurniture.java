package net.alminoris.aestheticseating.block.custom;

import net.alminoris.aestheticseating.entity.custom.SeatEntity;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

public abstract class SeatingFurniture extends Block implements Waterloggable
{
    private final double seatY;

    public SeatingFurniture(Settings settings, double seatY)
    {
        super(settings);
        this.seatY = seatY;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit)
    {
        if (world.isClient)
        {
            return ActionResult.SUCCESS;
        }

        if (!player.hasVehicle()) {
            boolean seatExists = world.getEntitiesByClass(SeatEntity.class, new Box(pos), Entity::isAlive)
                    .stream().findFirst().isPresent();

            if (!seatExists) {
                SeatEntity seat = SeatEntity.createOrReuse(world, pos, this.seatY);
                world.spawnEntity(seat);

                player.startRiding(seat, true);
            }
        }
        return ActionResult.SUCCESS;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state)
    {
        return BlockRenderType.MODEL;
    }
}
