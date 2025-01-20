package net.alminoris.aestheticseating;

import net.alminoris.aestheticseating.block.ModBlocks;
import net.alminoris.aestheticseating.entity.ModEntities;
import net.alminoris.aestheticseating.item.ModItemGroups;
import net.alminoris.aestheticseating.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AestheticSeating implements ModInitializer
{
	public static final String MOD_ID = "aestheticseating";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItems.registerItems();
		ModBlocks.registerBlocks();
		ModEntities.registerEntities();
	}
}