package net.alminoris.aestheticseating;

import net.alminoris.aestheticseating.datagen.ModLootTableProvider;
import net.alminoris.aestheticseating.datagen.ModModelProvider;
import net.alminoris.aestheticseating.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class AestheticSeatingDataGenerator implements DataGeneratorEntrypoint
{
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
	{
		fabricDataGenerator.addProvider(ModModelProvider::new);
		fabricDataGenerator.addProvider(ModRecipeProvider::new);
		fabricDataGenerator.addProvider(ModLootTableProvider::new);
	}
}
