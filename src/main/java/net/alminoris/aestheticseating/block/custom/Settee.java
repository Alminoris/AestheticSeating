package net.alminoris.aestheticseating.block.custom;

import net.alminoris.aestheticseating.block.ModBlocks;
import net.alminoris.aestheticseating.item.ModItems;
import net.alminoris.aestheticseating.util.helper.VoxelShapeHelper;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.IntProperty;
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

public class Settee extends SeatingFurniture
{
    private static final VoxelShape SEAT = Settee.createCuboidShape(-4.0D, 0.0D, 0.0D, 20.0D, 4.0D, 14.0D);

    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public static final IntProperty VARIANT = IntProperty.of("variant", 0, 2);

    public static final BooleanProperty TRANSFORMED = BooleanProperty.of("transformed");

    private final String name;

    public Settee(String name)
    {
        super(Settings.copy(Blocks.BLACK_WOOL), -0.25D);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(TRANSFORMED, false).with(VARIANT, 0));
        this.name = name;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx)
    {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, TRANSFORMED, VARIANT);
    }

    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit)
    {
        boolean currentTransformed = state.get(TRANSFORMED);
        int currentVariant = state.get(VARIANT);
        Direction currentFacing = state.get(FACING);

        if (stack.getItem() == ModItems.WRENCH)
        {
            if (!world.isClient)
            {
                world.setBlockState(pos, state
                        .with(FACING, currentFacing)
                        .with(TRANSFORMED, !currentTransformed)
                        .with(VARIANT, currentVariant));

                if (stack.getDamage() < stack.getMaxDamage() - 1)
                    stack.setDamage(stack.getDamage() + 1);
                else
                    stack.decrement(1);
            }

            return ItemActionResult.SUCCESS;
        }

        if (stack.getItem() == ModBlocks.CUSHIONS.get(name).asItem() && currentVariant < 2)
        {
            if (!world.isClient)
            {
                world.setBlockState(pos, state
                        .with(FACING, currentFacing)
                        .with(TRANSFORMED, currentTransformed)
                        .with(VARIANT, currentVariant+1));

                stack.decrement(1);
            }

            return ItemActionResult.SUCCESS;
        }

        if (stack.getItem() == ModItems.CUSHION_REMOVER && currentVariant > 0)
        {
            if (!world.isClient)
            {
                world.setBlockState(pos, state
                        .with(FACING, currentFacing)
                        .with(TRANSFORMED, currentTransformed)
                        .with(VARIANT, currentVariant-1));

                if (stack.getDamage() < stack.getMaxDamage() - 1)
                    stack.setDamage(stack.getDamage() + 1);
                else
                    stack.decrement(1);

                ItemStack carpetStack = new ItemStack(ModBlocks.CUSHIONS.get(name));
                if (!player.getInventory().insertStack(carpetStack))
                    player.dropItem(carpetStack, false);
            }

            return ItemActionResult.SUCCESS;
        }

        return super.onUseWithItem(stack, state, world, pos, player, hand, hit);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        return getRotatedShape(state);
    }

    private VoxelShape getRotatedShape(BlockState state)
    {
        Direction direction = state.get(FACING); // Assuming you have a FACING property

        List<Box> boxes = new ArrayList<>();
        boxes.add(SEAT.getBoundingBox());

        return VoxelShapeHelper.rotateShape(boxes, direction);
    }
}
