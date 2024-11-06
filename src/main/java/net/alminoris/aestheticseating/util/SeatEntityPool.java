package net.alminoris.aestheticseating.util;

import net.alminoris.aestheticseating.entity.ModEntities;
import net.alminoris.aestheticseating.entity.custom.SeatEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.*;

public class SeatEntityPool
{
    private static final SeatEntityPool INSTANCE = new SeatEntityPool();
    private final Queue<SeatEntity> availableSeats = new ArrayDeque<>();

    public static SeatEntityPool getInstance()
    {
        return INSTANCE;
    }

    public SeatEntity obtainSeat(World world, BlockPos pos)
    {
        SeatEntity seat = availableSeats.poll();

        if (seat == null || !seat.isAlive())
        {
            seat = new SeatEntity(ModEntities.SEAT, world);
        }
        else
        {
            seat.setPosition(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5);
            seat.cleanupTimer = 0; // Reset cleanup timer to prevent immediate removal
        }
        return seat;
    }

    public void release(SeatEntity seatEntity)
    {
        if (seatEntity.isAlive())
        {
            seatEntity.setRemoved(Entity.RemovalReason.DISCARDED);
            availableSeats.offer(seatEntity);
        }
    }

}