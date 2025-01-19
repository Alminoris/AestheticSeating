package net.alminoris.aestheticseating.item;

import net.alminoris.aestheticseating.AestheticSeating;
import net.alminoris.aestheticseating.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;

public class ModItemGroups
{
    public static final String[] EXTRA_WOODS_WF =
            {
                    "olive", "tamarisk"
            };

    public static final String[] EXTRA_WOODS_AN =
            {
                    "hazelnut", "hornbeam", "hawthorn", "quince", "plum", "mango", "fig", "viburnum", "white_mulberry", "wild_cherry",
                    "bauhinia", "pine", "fir", "cedar"
            };

    public static final ItemGroup ASEAT_TAB = FabricItemGroupBuilder.build(new Identifier(AestheticSeating.MOD_ID, "aseattab"),
            () -> new ItemStack(ModBlocks.SIMPLE_CHAIRS.get("oak")));

    public static void registerItemGroups()
    {
        if (FabricLoader.getInstance().isModLoaded("arborealnature"))
        {
            for(String name : EXTRA_WOODS_AN)
            {

            }
            for(String name : EXTRA_WOODS_AN)
            {

            }
            for(String name : EXTRA_WOODS_AN)
            {

            }
        }
        if (FabricLoader.getInstance().isModLoaded("wildfields"))
        {
            for(String name : EXTRA_WOODS_WF)
            {

            }
            for(String name : EXTRA_WOODS_WF)
            {

            }
            for(String name : EXTRA_WOODS_WF)
            {

            }
        }
    }
}
