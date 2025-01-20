package net.alminoris.aestheticseating.datagen;

import net.alminoris.aestheticseating.block.ModBlocks;
import net.alminoris.aestheticseating.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider
{
    public ModLootTableProvider(FabricDataGenerator dataGenerator)
    {
        super(dataGenerator);
    }

    @Override
    public void generateBlockLootTables()
    {
        for(String name : BlockSetsHelper.WOODS)
        {
            addDrop(ModBlocks.SIMPLE_CHAIRS.get(name));
        }
        for(String name : BlockSetsHelper.WOODS)
        {
            addDrop(ModBlocks.SIMPLE_BENCHES.get(name));
        }
        for(String name : BlockSetsHelper.STONES)
        {
            addDrop(ModBlocks.STONE_BENCHES.get(name));
        }
        for(String name : BlockSetsHelper.WOODS)
        {
            addDrop(ModBlocks.SIMPLE_STOOLS.get(name));
        }
        for(String name : BlockSetsHelper.COLORS)
        {
            addDrop(ModBlocks.SOFAS.get(name));
            addDrop(ModBlocks.SETTEES.get(name));
            addDrop(ModBlocks.CUSHIONS.get(name));
        }
    }
}
