package net.alminoris.aestheticseating.entity.custom;
import net.alminoris.aestheticseating.entity.ModEntities;
import net.alminoris.aestheticseating.util.SeatEntityPool;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SeatEntity extends Entity
{
    private static final int CLEANUP_DELAY = 20; // 5 seconds delay before cleanup if unused
    public int cleanupTimer = 0;

    public SeatEntity(EntityType<? extends SeatEntity> type, World world)
    {
        super(type, world);
        this.noClip = true;
    }

    public static SeatEntity createOrReuse(World world, BlockPos pos)
    {
        SeatEntity seat = SeatEntityPool.getInstance().obtainSeat(world, pos);
        seat.setPosition(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5);
        return seat;
    }

    @Override
    public void tick()
    {
        super.tick();

        if (getPassengerList().isEmpty() && !getWorld().isClient)
        {
            cleanupTimer++;
            if (cleanupTimer >= CLEANUP_DELAY)
            {
                cleanupTimer = 0;
                SeatEntityPool.getInstance().release(this);
            }
        }
        else
        {
            cleanupTimer = 0; // Reset timer if occupied
        }
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) { }

    @Override
    protected void readCustomDataFromNbt(NbtCompound nbt) {}

    @Override
    protected void writeCustomDataToNbt(NbtCompound nbt) {}

    @Override
    public boolean doesNotCollide(double offsetX, double offsetY, double offsetZ)
    {
        return true;
    }
}
