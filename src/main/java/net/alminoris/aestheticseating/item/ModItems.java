package net.alminoris.aestheticseating.item;

import net.alminoris.aestheticseating.AestheticSeating;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
    public static final Item CUSHION_REMOVER = registerItem("cushion_remover", new ToolItem(ToolMaterials.IRON, new Item.Settings().maxCount(1)));
    public static final Item WRENCH = registerItem("wrench", new ToolItem(ToolMaterials.IRON, new Item.Settings().maxCount(1)));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(AestheticSeating.MOD_ID, name), item);
    }

    public static void registerItems()
    {

    }
}
