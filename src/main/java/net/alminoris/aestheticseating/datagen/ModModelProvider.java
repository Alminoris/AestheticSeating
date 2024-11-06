package net.alminoris.aestheticseating.datagen;

import net.alminoris.aestheticseating.AestheticSeating;
import net.alminoris.aestheticseating.block.ModBlocks;
import net.alminoris.aestheticseating.item.ModItems;
import net.alminoris.aestheticseating.util.helper.BlockSetsHelper;
import net.alminoris.aestheticseating.util.helper.ModJsonHelper;
import net.alminoris.aestheticseating.util.helper.ModJsonTemplates;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        for(String woodName : BlockSetsHelper.getWoods())
        {
            for(String name : BlockSetsHelper.COLORS)
            {
                registerSimpleChair(woodName, name);
            }
            ModJsonHelper.createSimpleChairBlockState(woodName);
            blockStateModelGenerator.registerParentedItemModel(ModBlocks.SIMPLE_CHAIRS.get(woodName), Identifier.of(AestheticSeating.MOD_ID, "block/black/simple_chair_"+woodName));
        }
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        itemModelGenerator.register(ModItems.CUSHION_REMOVER, Models.GENERATED);
        itemModelGenerator.register(ModItems.WRENCH, Models.GENERATED);
    }

    private void registerSimpleChair(String woodVariant, String colorVariant)
    {
        ModJsonHelper.createSimpleChairModel(ModJsonTemplates.SIMPLE_CHAIR_TEMPLATE, colorVariant, woodVariant, false, false);
        ModJsonHelper.createSimpleChairModel(ModJsonTemplates.SIMPLE_CHAIR_RECLINED_TEMPLATE, colorVariant, woodVariant, true, false);
        ModJsonHelper.createSimpleChairModel(ModJsonTemplates.SIMPLE_CHAIR_CARPETED_TEMPLATE, colorVariant, woodVariant, false, true);
        ModJsonHelper.createSimpleChairModel(ModJsonTemplates.SIMPLE_CHAIR_RECLINED_CARPETED_TEMPLATE, colorVariant, woodVariant, true, true);
    }
}
