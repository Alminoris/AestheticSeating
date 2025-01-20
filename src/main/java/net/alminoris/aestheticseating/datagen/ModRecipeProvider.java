package net.alminoris.aestheticseating.datagen;

import net.alminoris.aestheticseating.block.ModBlocks;
import net.alminoris.aestheticseating.item.ModItems;
import net.alminoris.aestheticseating.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider
{


    public ModRecipeProvider(FabricDataGenerator dataGenerator)
    {
        super(dataGenerator);
    }

    @Override
    public void generateRecipes(Consumer<RecipeJsonProvider> recipeExporter)
    {
        ShapedRecipeJsonBuilder.create(ModItems.CUSHION_REMOVER, 1)
                .pattern(" ##")
                .pattern(" /#")
                .pattern("/  ")
                .input('#', Items.IRON_INGOT)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(ModItems.WRENCH, 1)
                .pattern(" # ")
                .pattern(" ##")
                .pattern("/  ")
                .input('#', Items.IRON_INGOT)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter);

        for(String name : BlockSetsHelper.WOODS)
        {
            String blockName = (name.equals("crimson") || name.equals("warped")) ? "stem" : (name.equals("bamboo") ? "block" : "log");

            registerSimpleChair(recipeExporter, ModBlocks.SIMPLE_CHAIRS.get(name),
                    Registry.BLOCK.get(new Identifier("minecraft", name+"_slab")),
                    Registry.BLOCK.get(new Identifier("minecraft", name+"_"+blockName)));

            registerSimpleStool(recipeExporter, ModBlocks.SIMPLE_STOOLS.get(name),
                    Registry.BLOCK.get(new Identifier("minecraft", name+"_slab")),
                    Registry.BLOCK.get(new Identifier("minecraft", name+"_"+blockName)));

            registerSimpleBench(recipeExporter, ModBlocks.SIMPLE_BENCHES.get(name),
                    Registry.BLOCK.get(new Identifier("minecraft", name+"_slab")),
                    Registry.BLOCK.get(new Identifier("minecraft", name+"_"+blockName)));
        }

        for(String name : BlockSetsHelper.COLORS)
        {
            registerSettee(recipeExporter, ModBlocks.SETTEES.get(name),
                    Registry.BLOCK.get(new Identifier("minecraft", name+"_wool")));

            registerSofa(recipeExporter, ModBlocks.SOFAS.get(name),
                    Registry.BLOCK.get(new Identifier("minecraft", name+"_wool")));
        }

        for(String name : BlockSetsHelper.COLORS)
        {
            offerSingleOutputShapelessRecipe(recipeExporter, ModBlocks.CUSHIONS.get(name), Registry.BLOCK.get(new Identifier("minecraft", name+"_wool")), "cushion");
        }

        for(String name : BlockSetsHelper.STONES)
        {
            if (!name.equals("blackstonebricks") && !name.equals("quartz") && !name.equals("basalt"))
            {
                registerStoneBench(recipeExporter,
                        Registry.BLOCK.get(new Identifier("minecraft", "polished_"+name)),
                        Registry.BLOCK.get(new Identifier("minecraft", "smooth_stone")),
                        ModBlocks.STONE_BENCHES.get(name));
            }
        }

        registerStoneBench(recipeExporter,
                Registry.BLOCK.get(new Identifier("minecraft", "polished_blackstone_bricks")),
                Registry.BLOCK.get(new Identifier("minecraft", "smooth_stone")),
                ModBlocks.STONE_BENCHES.get("blackstonebricks"));

        registerStoneBench(recipeExporter,
                Registry.BLOCK.get(new Identifier("minecraft", "smooth_basalt")),
                Registry.BLOCK.get(new Identifier("minecraft", "smooth_stone")),
                ModBlocks.STONE_BENCHES.get("basalt"));

        registerStoneBench(recipeExporter,
                Registry.BLOCK.get(new Identifier("minecraft", "quartz_block")),
                Registry.BLOCK.get(new Identifier("minecraft", "smooth_stone")),
                ModBlocks.STONE_BENCHES.get("quartz"));
    }

    private static void registerSimpleChair(Consumer<RecipeJsonProvider> recipeExporter, Block block, Block slab, Block log)
    {
        ShapedRecipeJsonBuilder.create(block, 1)
                .pattern("#  ")
                .pattern("###")
                .pattern("/ /")
                .input('#', slab)
                .input('/', log)
                .criterion(hasItem(slab), conditionsFromItem(slab))
                .criterion(hasItem(log), conditionsFromItem(log))
                .offerTo(recipeExporter);
    }

    private static void registerSimpleBench(Consumer<RecipeJsonProvider> recipeExporter, Block block, Block slab, Block log)
    {
        ShapedRecipeJsonBuilder.create(block, 1)
                .pattern("##")
                .pattern("//")
                .input('#', slab)
                .input('/', log)
                .criterion(hasItem(slab), conditionsFromItem(slab))
                .criterion(hasItem(log), conditionsFromItem(log))
                .offerTo(recipeExporter);
    }

    private static void registerStoneBench(Consumer<RecipeJsonProvider> recipeExporter, Block base, Block legs, Block result)
    {
        ShapedRecipeJsonBuilder.create(result, 1)
                .pattern("##")
                .pattern("//")
                .input('#', base)
                .input('/', legs)
                .criterion(hasItem(base), conditionsFromItem(base))
                .criterion(hasItem(legs), conditionsFromItem(legs))
                .offerTo(recipeExporter);
    }

    private static void registerSimpleStool(Consumer<RecipeJsonProvider> recipeExporter, Block block, Block slab, Block log)
    {
        ShapedRecipeJsonBuilder.create(block, 1)
                .pattern("###")
                .pattern("/ /")
                .input('#', slab)
                .input('/', log)
                .criterion(hasItem(slab), conditionsFromItem(slab))
                .criterion(hasItem(log), conditionsFromItem(log))
                .offerTo(recipeExporter);
    }

    private static void registerSettee(Consumer<RecipeJsonProvider> recipeExporter, Block block, Block wool)
    {
        ShapedRecipeJsonBuilder.create(block, 1)
                .pattern("# #")
                .pattern("###")
                .input('#', wool)
                .criterion(hasItem(wool), conditionsFromItem(wool))
                .offerTo(recipeExporter);
    }

    private static void registerSofa(Consumer<RecipeJsonProvider> recipeExporter, Block block, Block wool)
    {
        ShapedRecipeJsonBuilder.create(block, 1)
                .pattern("##")
                .pattern("//")
                .input('#', wool)
                .input('/', Blocks.GRAY_CONCRETE)
                .criterion(hasItem(wool), conditionsFromItem(wool))
                .criterion(hasItem(Blocks.GRAY_CONCRETE), conditionsFromItem(Blocks.GRAY_CONCRETE))
                .offerTo(recipeExporter);
    }
}