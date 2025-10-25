package net.alminoris.aestheticseating;

import net.alminoris.aestheticseating.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class AestheticSeatingDataGenerator implements DataGeneratorEntrypoint
{
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
	{
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModLanguageProviderEnUs::new);
		pack.addProvider(ModLanguageProviderDeDe::new);
		pack.addProvider(ModLanguageProviderEsEs::new);
		pack.addProvider(ModLanguageProviderFrFr::new);
		pack.addProvider(ModLanguageProviderRuRu::new);
		pack.addProvider(ModLanguageProviderUkUa::new);
	}
}
