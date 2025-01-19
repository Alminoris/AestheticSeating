package net.alminoris.aestheticseating.block;

import net.alminoris.aestheticseating.AestheticSeating;
import net.alminoris.aestheticseating.block.custom.*;
import net.alminoris.aestheticseating.item.ModItemGroups;
import net.alminoris.aestheticseating.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Dictionary;
import java.util.Hashtable;

public class ModBlocks
{
    public static final Dictionary<String, Block> SIMPLE_CHAIRS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("simple_chair_"+name, new SimpleChair()));
        }
    }};

    public static final Dictionary<String, Block> SIMPLE_BENCHES = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("simple_bench_"+name, new SimpleBench(name)));
        }
    }};

    public static final Dictionary<String, Block> STONE_BENCHES = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.STONES)
        {
            put(name, registerBlock("stone_bench_"+name, new StoneBench()));
        }
    }};

    public static final Dictionary<String, Block> SIMPLE_STOOLS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("simple_stool_"+name, new SimpleStool(name)));
        }
    }};

    public static final Dictionary<String, Block> SETTEES = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("settee_"+name, new Settee(name)));
        }
    }};

    public static final Dictionary<String, Block> SOFAS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("sofa_"+name, new Sofa(name)));
        }
    }};

    public static final Dictionary<String, Block> CUSHIONS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("cushion_"+name, new Cushion()));
        }
    }};

    public static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block, ModItemGroups.ASEAT_TAB);
        return Registry.register(Registry.BLOCK, Identifier.of(AestheticSeating.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block, ItemGroup tab)
    {
        Registry.register(Registry.ITEM, Identifier.of(AestheticSeating.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerBlocks()
    {

    }
}
