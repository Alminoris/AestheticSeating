package net.alminoris.aestheticseating.item;

import net.alminoris.aestheticseating.AestheticSeating;
import net.alminoris.aestheticseating.block.ModBlocks;
import net.alminoris.aestheticseating.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups
{
    public static final ItemGroup ASEAT_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AestheticSeating.MOD_ID, "aseattab"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.aseattab"))
                    .icon(() -> new ItemStack(ModBlocks.SIMPLE_CHAIRS.get("oak"))).entries((displayContext, entries) ->
                    {
                        entries.add(ModItems.CUSHION_REMOVER);
                        entries.add(ModItems.WRENCH);
                        for(String name : BlockSetsHelper.WOODS)
                        {
                            entries.add(ModBlocks.SIMPLE_CHAIRS.get(name));
                        }
                        for(String name : BlockSetsHelper.WOODS)
                        {
                            entries.add(ModBlocks.SIMPLE_STOOLS.get(name));
                        }
                        for(String name : BlockSetsHelper.WOODS)
                        {
                            entries.add(ModBlocks.SIMPLE_BENCHES.get(name));
                        }
                        for(String name : BlockSetsHelper.STONES)
                        {
                            entries.add(ModBlocks.STONE_BENCHES.get(name));
                        }
                        if (FabricLoader.getInstance().isModLoaded("arborealnature"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_WOODS)
                            {
                                entries.add(ModBlocks.SIMPLE_CHAIRS.get(name));
                            }
                            for(String name : BlockSetsHelper.EXTRA_WOODS)
                            {
                                entries.add(ModBlocks.SIMPLE_STOOLS.get(name));
                            }
                            for(String name : BlockSetsHelper.EXTRA_WOODS)
                            {
                                entries.add(ModBlocks.SIMPLE_BENCHES.get(name));
                            }
                        }
                        for(String name : BlockSetsHelper.COLORS)
                        {
                            entries.add(ModBlocks.SETTEES.get(name));
                        }
                        for(String name : BlockSetsHelper.COLORS)
                        {
                            entries.add(ModBlocks.CUSHIONS.get(name));
                        }
                    }).build());

    public static void registerItemGroups()
    {

    }
}
