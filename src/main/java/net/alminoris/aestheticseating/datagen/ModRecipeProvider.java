package net.alminoris.aestheticseating.datagen;

import net.alminoris.aestheticseating.AestheticSeating;
import net.alminoris.aestheticseating.block.ModBlocks;
import net.alminoris.aestheticseating.item.ModItems;
import net.alminoris.aestheticseating.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider
{
    public ModRecipeProvider(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> recipeExporter)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.CUSHION_REMOVER, 1)
                .pattern(" ##")
                .pattern(" /#")
                .pattern("/  ")
                .input('#', Items.IRON_INGOT)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.WRENCH, 1)
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
                    Registries.BLOCK.get(Identifier.of("minecraft", name+"_slab")),
                    Registries.BLOCK.get(Identifier.of("minecraft", name+"_"+blockName)));

            registerSimpleStool(recipeExporter, ModBlocks.SIMPLE_STOOLS.get(name),
                    Registries.BLOCK.get(Identifier.of("minecraft", name+"_slab")),
                    Registries.BLOCK.get(Identifier.of("minecraft", name+"_"+blockName)));

            registerSimpleBench(recipeExporter, ModBlocks.SIMPLE_BENCHES.get(name),
                    Registries.BLOCK.get(Identifier.of("minecraft", name+"_slab")),
                    Registries.BLOCK.get(Identifier.of("minecraft", name+"_"+blockName)));
        }

        for(String name : BlockSetsHelper.COLORS)
        {
            registerSettee(recipeExporter, ModBlocks.SETTEES.get(name),
                    Registries.BLOCK.get(Identifier.of("minecraft", name+"_wool")));

            registerSofa(recipeExporter, ModBlocks.SOFAS.get(name),
                    Registries.BLOCK.get(Identifier.of("minecraft", name+"_wool")));
        }

        for(String name : BlockSetsHelper.COLORS)
        {
            offerSingleOutputShapelessRecipe(recipeExporter, ModBlocks.CUSHIONS.get(name), Registries.BLOCK.get(Identifier.of("minecraft", name+"_wool")), "cushion");
        }

        for(String name : BlockSetsHelper.STONES)
        {
            if (!name.equals("blackstonebricks") && !name.equals("quartz") && !name.equals("basalt"))
            {
                registerStoneBench(recipeExporter,
                        Registries.BLOCK.get(Identifier.of("minecraft", "polished_"+name)),
                        Registries.BLOCK.get(Identifier.of("minecraft", "smooth_stone")),
                        ModBlocks.STONE_BENCHES.get(name));
            }
        }

        registerStoneBench(recipeExporter,
                Registries.BLOCK.get(Identifier.of("minecraft", "polished_blackstone_bricks")),
                Registries.BLOCK.get(Identifier.of("minecraft", "smooth_stone")),
                ModBlocks.STONE_BENCHES.get("blackstonebricks"));

        registerStoneBench(recipeExporter,
                Registries.BLOCK.get(Identifier.of("minecraft", "smooth_basalt")),
                Registries.BLOCK.get(Identifier.of("minecraft", "smooth_stone")),
                ModBlocks.STONE_BENCHES.get("basalt"));

        registerStoneBench(recipeExporter,
                Registries.BLOCK.get(Identifier.of("minecraft", "quartz_block")),
                Registries.BLOCK.get(Identifier.of("minecraft", "smooth_stone")),
                ModBlocks.STONE_BENCHES.get("quartz"));
    }

    private static void registerSimpleChair(Consumer<RecipeJsonProvider> recipeExporter, Block block, Block slab, Block log)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, block, 1)
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
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, block, 1)
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
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, result, 1)
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
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, block, 1)
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
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, block, 1)
                .pattern("# #")
                .pattern("###")
                .input('#', wool)
                .criterion(hasItem(wool), conditionsFromItem(wool))
                .offerTo(recipeExporter);
    }

    private static void registerSofa(Consumer<RecipeJsonProvider> recipeExporter, Block block, Block wool)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, block, 1)
                .pattern("##")
                .pattern("//")
                .input('#', wool)
                .input('/', Blocks.GRAY_CONCRETE)
                .criterion(hasItem(wool), conditionsFromItem(wool))
                .criterion(hasItem(Blocks.GRAY_CONCRETE), conditionsFromItem(Blocks.GRAY_CONCRETE))
                .offerTo(recipeExporter);
    }
}
