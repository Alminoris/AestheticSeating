package net.alminoris.aestheticseating.block;

import net.alminoris.aestheticseating.AestheticSeating;
import net.alminoris.aestheticseating.block.custom.SimpleChair;
import net.alminoris.aestheticseating.util.helper.BlockSetsHelper;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

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

    public static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AestheticSeating.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block)
    {
        Registry.register(Registries.ITEM, Identifier.of(AestheticSeating.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerBlocks()
    {

    }
}