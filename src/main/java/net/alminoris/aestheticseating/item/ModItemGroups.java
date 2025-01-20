package net.alminoris.aestheticseating.item;

import net.alminoris.aestheticseating.AestheticSeating;
import net.alminoris.aestheticseating.block.ModBlocks;
import net.alminoris.aestheticseating.block.custom.SimpleStool;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class ModItemGroups
{
    public static List<String> EXTRA_WOODS_WF = new ArrayList<>();

    public static List<String> EXTRA_WOODS_AN = new ArrayList<>();

    public static final ItemGroup ASEAT_TAB = FabricItemGroupBuilder.build(new Identifier(AestheticSeating.MOD_ID, "aseattab"),
            () -> new ItemStack(ModBlocks.SIMPLE_CHAIRS.get("oak")));

    public static void registerModItemGroups()
    {
        if (FabricLoader.getInstance().isModLoaded("arborealnature"))
        {
            EXTRA_WOODS_AN = List.of("hazelnut", "hornbeam", "hawthorn", "quince", "plum", "mango", "fig", "viburnum",
                    "white_mulberry", "wild_cherry", "bauhinia", "pine", "fir", "cedar");
        }
        if (FabricLoader.getInstance().isModLoaded("wildfields"))
        {
            EXTRA_WOODS_WF = List.of("olive", "tamarisk");
        }
    }
}
