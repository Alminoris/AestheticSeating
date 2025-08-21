package net.alminoris.aestheticseating.item;

import net.alminoris.aestheticseating.AestheticSeating;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{
    public static final Item CUSHION_REMOVER = registerItem("cushion_remover", new ToolItem(ToolMaterials.IRON, new FabricItemSettings().maxCount(1).group(ModItemGroups.ASEAT_TAB)));
    public static final Item WRENCH = registerItem("wrench", new ToolItem(ToolMaterials.IRON, new FabricItemSettings().maxCount(1).group(ModItemGroups.ASEAT_TAB)));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(AestheticSeating.MOD_ID, name), item);
    }

    public static void registerItems()
    {

    }
}
