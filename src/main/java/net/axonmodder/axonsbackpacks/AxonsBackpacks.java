package net.axonmodder.axonsbackpacks;

import net.axonmodder.axonsbackpacks.item.ModBlocks;
import net.axonmodder.axonsbackpacks.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AxonsBackpacks implements ModInitializer {
	public static final String MOD_ID = "axonsbackpacks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
