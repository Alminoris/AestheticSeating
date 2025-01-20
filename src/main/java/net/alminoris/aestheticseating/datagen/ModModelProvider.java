package net.alminoris.aestheticseating.datagen;

import net.alminoris.aestheticseating.AestheticSeating;
import net.alminoris.aestheticseating.block.ModBlocks;
import net.alminoris.aestheticseating.item.ModItems;
import net.alminoris.aestheticseating.util.helper.BlockSetsHelper;
import net.alminoris.aestheticseating.util.helper.ModJsonHelper;
import net.alminoris.aestheticseating.util.helper.ModJsonTemplates;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataGenerator dataGenerator)
    {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        for(String woodName : BlockSetsHelper.WOODS)
        {
            for(String name : BlockSetsHelper.COLORS)
            {
                registerSimpleChair(woodName, name);
                registerSimpleStool(woodName, name);
            }
            registerSimpleBench(woodName);
            ModJsonHelper.createSimpleChairBlockState(woodName);
            ModJsonHelper.createSimpleBenchBlockState(woodName);
            ModJsonHelper.createSimpleStoolBlockState(woodName);
            blockStateModelGenerator.registerParentedItemModel(ModBlocks.SIMPLE_CHAIRS.get(woodName), new Identifier(AestheticSeating.MOD_ID, "block/black/simple_chair_"+woodName));
            blockStateModelGenerator.registerParentedItemModel(ModBlocks.SIMPLE_BENCHES.get(woodName), new Identifier(AestheticSeating.MOD_ID, "block/simple_bench_"+woodName));
            blockStateModelGenerator.registerParentedItemModel(ModBlocks.SIMPLE_STOOLS.get(woodName), new Identifier(AestheticSeating.MOD_ID, "block/black/simple_stool_normal_"+woodName));
        }

        for(String name : BlockSetsHelper.STONES)
        {
            registerStoneBench(name);
            ModJsonHelper.createStoneBenchBlockState(name);
            blockStateModelGenerator.registerParentedItemModel(ModBlocks.STONE_BENCHES.get(name), new Identifier(AestheticSeating.MOD_ID, "block/stone_bench_"+name));
        }

        for(String name : BlockSetsHelper.COLORS)
        {
            registerSofa(name);
            ModJsonHelper.createSofaBlockState(name);
            blockStateModelGenerator.registerParentedItemModel(ModBlocks.SOFAS.get(name), new Identifier(AestheticSeating.MOD_ID, "block/sofa_"+name));

            registerSettee(name);
            blockStateModelGenerator.registerParentedItemModel(ModBlocks.SETTEES.get(name), new Identifier(AestheticSeating.MOD_ID, "block/settee_"+name+"_0"));

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

    private void registerSimpleBench(String woodVariant)
    {
        ModJsonHelper.createSimpleBenchModel(ModJsonTemplates.SIMPLE_BENCH_NORMAL_MODEL, woodVariant, "normal", false);
        ModJsonHelper.createSimpleBenchModel(ModJsonTemplates.SIMPLE_BENCH_CENTER_MODEL, woodVariant, "center", false);
        ModJsonHelper.createSimpleBenchModel(ModJsonTemplates.SIMPLE_BENCH_LEFT_MODEL, woodVariant, "left", false);
        ModJsonHelper.createSimpleBenchModel(ModJsonTemplates.SIMPLE_BENCH_RIGHT_MODEL, woodVariant, "right", false);

        ModJsonHelper.createSimpleBenchModel(ModJsonTemplates.SIMPLE_BENCH_NORMAL_BACKREST_MODEL, woodVariant, "normal", true);
        ModJsonHelper.createSimpleBenchModel(ModJsonTemplates.SIMPLE_BENCH_CENTER_BACKREST_MODEL, woodVariant, "center", true);
        ModJsonHelper.createSimpleBenchModel(ModJsonTemplates.SIMPLE_BENCH_LEFT_BACKREST_MODEL, woodVariant, "left", true);
        ModJsonHelper.createSimpleBenchModel(ModJsonTemplates.SIMPLE_BENCH_RIGHT_BACKREST_MODEL, woodVariant, "right", true);
    }

    private void registerStoneBench(String stoneVariant)
    {
        ModJsonHelper.createStoneBenchModel(ModJsonTemplates.STONE_BENCH_NORMAL_MODEL, stoneVariant, "normal");
        ModJsonHelper.createStoneBenchModel(ModJsonTemplates.STONE_BENCH_CENTER_MODEL, stoneVariant, "center");
        ModJsonHelper.createStoneBenchModel(ModJsonTemplates.STONE_BENCH_LEFT_MODEL, stoneVariant, "left");
        ModJsonHelper.createStoneBenchModel(ModJsonTemplates.STONE_BENCH_RIGHT_MODEL, stoneVariant, "right");
    }

    private void registerSofa(String colorVariant)
    {
        ModJsonHelper.createSofaModel(ModJsonTemplates.SOFA_NORMAL_MODEL, colorVariant, "normal", false);
        ModJsonHelper.createSofaModel(ModJsonTemplates.SOFA_CENTER_MODEL, colorVariant, "center", false);
        ModJsonHelper.createSofaModel(ModJsonTemplates.SOFA_LEFT_MODEL, colorVariant, "left", false);
        ModJsonHelper.createSofaModel(ModJsonTemplates.SOFA_RIGHT_MODEL, colorVariant, "right", false);
        ModJsonHelper.createSofaModel(ModJsonTemplates.SOFA_LEFTCORNER_MODEL, colorVariant, "leftcorner", false);
        ModJsonHelper.createSofaModel(ModJsonTemplates.SOFA_RIGHTCORNER_MODEL, colorVariant, "rightcorner", false);

        ModJsonHelper.createSofaModel(ModJsonTemplates.SOFA_NORMAL_CUSHION_MODEL, colorVariant, "normal", true);
        ModJsonHelper.createSofaModel(ModJsonTemplates.SOFA_CENTER_CUSHION_MODEL, colorVariant, "center", true);
        ModJsonHelper.createSofaModel(ModJsonTemplates.SOFA_LEFT_CUSHION_MODEL, colorVariant, "left", true);
        ModJsonHelper.createSofaModel(ModJsonTemplates.SOFA_RIGHT_CUSHION_MODEL, colorVariant, "right", true);
        ModJsonHelper.createSofaModel(ModJsonTemplates.SOFA_LEFTCORNER_CUSHION_MODEL, colorVariant, "leftcorner", true);
        ModJsonHelper.createSofaModel(ModJsonTemplates.SOFA_RIGHTCORNER_CUSHION_MODEL, colorVariant, "rightcorner", true);
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
