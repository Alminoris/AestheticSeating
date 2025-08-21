package net.alminoris.aestheticseating.util.helper;

import net.alminoris.aestheticseating.item.ModItemGroups;

public class BlockSetsHelper
{
    public static final String[] COLORS =
            {
                    "black", "brown", "gray", "light_gray",
                    "white", "red", "orange", "yellow",
                    "purple", "magenta", "pink", "blue",
                    "cyan", "light_blue", "green", "lime"
            };

    public static final String[] STONES =
            {
                    "stone", "tuff", "blackstone", "andesite", "diorite", "granite",  "deepslate", "basalt_side",
                    "quartz_block_bottom", "stone_bricks", "bricks", "mud_bricks", "sandstone"
            };

    public static final String[] WOODS =
            {
                    "oak", "birch", "spruce", "jungle", "acacia", "dark_oak",
                    "crimson", "warped", "mangrove"
            };

    public static String[] getWoods()
    {
        String[] combinedWoods = new String[WOODS.length + ModItemGroups.AN_WOOD_NAMES.size() + ModItemGroups.WF_WOOD_NAMES.size()];
        System.arraycopy(WOODS, 0, combinedWoods, 0, WOODS.length);
        System.arraycopy(ModItemGroups.AN_WOOD_NAMES.toArray(new String[ModItemGroups.AN_WOOD_NAMES.size()]), 0, combinedWoods,
                WOODS.length, ModItemGroups.AN_WOOD_NAMES.size());
        System.arraycopy(ModItemGroups.WF_WOOD_NAMES.toArray(new String[ModItemGroups.WF_WOOD_NAMES.size()]), 0, combinedWoods,
                WOODS.length+ModItemGroups.AN_WOOD_NAMES.size(), ModItemGroups.WF_WOOD_NAMES.size());
        System.arraycopy(ModItemGroups.ST_WOOD_NAMES.toArray(new String[ModItemGroups.ST_WOOD_NAMES.size()]), 0, combinedWoods,
                WOODS.length+ModItemGroups.AN_WOOD_NAMES.size()+ModItemGroups.WF_WOOD_NAMES.size(), ModItemGroups.ST_WOOD_NAMES.size());
        System.arraycopy(ModItemGroups.WT_WOOD_NAMES.toArray(new String[ModItemGroups.WT_WOOD_NAMES.size()]), 0, combinedWoods,
                WOODS.length+ModItemGroups.AN_WOOD_NAMES.size()+ModItemGroups.WF_WOOD_NAMES.size()+ModItemGroups.ST_WOOD_NAMES.size(),
                ModItemGroups.ST_WOOD_NAMES.size());
        System.arraycopy(ModItemGroups.MT_WOOD_NAMES.toArray(new String[ModItemGroups.MT_WOOD_NAMES.size()]), 0, combinedWoods,
                WOODS.length+ModItemGroups.AN_WOOD_NAMES.size()+ModItemGroups.WF_WOOD_NAMES.size()+ModItemGroups.ST_WOOD_NAMES.size(),
                ModItemGroups.ST_WOOD_NAMES.size()+ModItemGroups.WT_WOOD_NAMES.size());
        System.arraycopy(ModItemGroups.NSS_WOOD_NAMES.toArray(new String[ModItemGroups.NSS_WOOD_NAMES.size()]), 0, combinedWoods,
                WOODS.length+ModItemGroups.AN_WOOD_NAMES.size()+ModItemGroups.WF_WOOD_NAMES.size()+ModItemGroups.ST_WOOD_NAMES.size(),
                ModItemGroups.ST_WOOD_NAMES.size()+ModItemGroups.WT_WOOD_NAMES.size()+ModItemGroups.MT_WOOD_NAMES.size());
        return combinedWoods;
    }

    public static String[] getStones()
    {
        String[] combinedWoods = new String[STONES.length + ModItemGroups.EXTRA_STONES_WF.size()];
        System.arraycopy(STONES, 0, combinedWoods, 0, STONES.length);
        System.arraycopy(ModItemGroups.EXTRA_STONES_WF.toArray(new String[ModItemGroups.EXTRA_STONES_WF.size()]), 0, combinedWoods, WOODS.length, ModItemGroups.EXTRA_STONES_WF.size());
        return combinedWoods;
    }
}
