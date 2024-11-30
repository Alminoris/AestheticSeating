package net.alminoris.aestheticseating.datagen;

import net.alminoris.aestheticseating.block.ModBlocks;
import net.alminoris.aestheticseating.item.ModItems;
import net.alminoris.aestheticseating.util.helper.BlockSetsHelper;
import net.alminoris.aestheticseating.util.helper.ModJsonHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider
{
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter)
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
        }

        for(String name : BlockSetsHelper.COLORS)
        {
            registerSettee(recipeExporter, ModBlocks.SETTEES.get(name),
                    Registries.BLOCK.get(Identifier.of("minecraft", name+"_wool")));
        }

        for(String name : BlockSetsHelper.COLORS)
        {
            offerSingleOutputShapelessRecipe(recipeExporter, ModBlocks.CUSHIONS.get(name), Registries.BLOCK.get(Identifier.of("minecraft", name+"_wool")), "cushion");
        }
    }

    private static void registerSimpleChair(RecipeExporter recipeExporter, Block block, Block slab, Block log)
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

    private static void registerSimpleStool(RecipeExporter recipeExporter, Block block, Block slab, Block log)
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

    private static void registerSettee(RecipeExporter recipeExporter, Block block, Block wool)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, block, 1)
                .pattern("# #")
                .pattern("###")
                .input('#', wool)
                .criterion(hasItem(wool), conditionsFromItem(wool))
                .offerTo(recipeExporter);
    }
}
