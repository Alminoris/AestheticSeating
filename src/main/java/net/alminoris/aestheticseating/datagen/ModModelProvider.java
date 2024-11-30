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
                registerSimpleStool(woodName, name);
            }
            ModJsonHelper.createSimpleChairBlockState(woodName);
            ModJsonHelper.createSimpleStoolBlockState(woodName);
            blockStateModelGenerator.registerParentedItemModel(ModBlocks.SIMPLE_CHAIRS.get(woodName), Identifier.of(AestheticSeating.MOD_ID, "block/black/simple_chair_"+woodName));
            blockStateModelGenerator.registerParentedItemModel(ModBlocks.SIMPLE_STOOLS.get(woodName), Identifier.of(AestheticSeating.MOD_ID, "block/black/simple_stool_normal_"+woodName));
        }

        for(String name : BlockSetsHelper.COLORS)
        {
            registerSettee(name);
            blockStateModelGenerator.registerParentedItemModel(ModBlocks.SETTEES.get(name), Identifier.of(AestheticSeating.MOD_ID, "block/settee_"+name+"_0"));

            ModJsonHelper.createCushionModel(name);
            blockStateModelGenerator.registerSimpleState(ModBlocks.CUSHIONS.get(name));
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

    private void registerSimpleStool(String woodVariant, String colorVariant)
    {
        ModJsonHelper.createSimpleStoolModel(ModJsonTemplates.SIMPLE_STOOL_NORMAL_MODEL_TEMPLATE, colorVariant, woodVariant, "normal", false);
        ModJsonHelper.createSimpleStoolModel(ModJsonTemplates.SIMPLE_STOOL_LATTICEBACK_MODEL_TEMPLATE, colorVariant, woodVariant, "latticeback", false);
        ModJsonHelper.createSimpleStoolModel(ModJsonTemplates.SIMPLE_STOOL_DESK_MODEL_TEMPLATE, colorVariant, woodVariant, "desk", false);
        ModJsonHelper.createSimpleStoolModel(ModJsonTemplates.SIMPLE_STOOL_NORMAL_CARPETED_MODEL_TEMPLATE, colorVariant, woodVariant, "normal", true);
        ModJsonHelper.createSimpleStoolModel(ModJsonTemplates.SIMPLE_STOOL_LATTICEBACK_CARPETED_MODEL_TEMPLATE, colorVariant, woodVariant, "latticeback", true);
        ModJsonHelper.createSimpleStoolModel(ModJsonTemplates.SIMPLE_STOOL_DESK_CARPETED_MODEL_TEMPLATE, colorVariant, woodVariant, "desk", true);
    }

    private void registerSettee(String colorVariant)
    {
        ModJsonHelper.createSetteeModel(ModJsonTemplates.SETTEE_0_MODEL_TEMPLATE, colorVariant, false, 0);
        ModJsonHelper.createSetteeModel(ModJsonTemplates.SETTEE_TRANSFORMED_0_MODEL_TEMPLATE, colorVariant,true, 0);
        ModJsonHelper.createSetteeModel(ModJsonTemplates.SETTEE_1_MODEL_TEMPLATE, colorVariant, false, 1);
        ModJsonHelper.createSetteeModel(ModJsonTemplates.SETTEE_TRANSFORMED_1_MODEL_TEMPLATE, colorVariant,true, 1);
        ModJsonHelper.createSetteeModel(ModJsonTemplates.SETTEE_2_MODEL_TEMPLATE, colorVariant, false, 2);
        ModJsonHelper.createSetteeModel(ModJsonTemplates.SETTEE_TRANSFORMED_2_MODEL_TEMPLATE, colorVariant,true, 2);
        ModJsonHelper.createSetteeBlockState(colorVariant);
    }
}
