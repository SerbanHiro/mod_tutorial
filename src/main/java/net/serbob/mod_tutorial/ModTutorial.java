package net.serbob.mod_tutorial;

import net.fabricmc.api.ModInitializer;
import net.serbob.mod_tutorial.block.ModBlocks;
import net.serbob.mod_tutorial.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModTutorial implements ModInitializer {
	public static final String MOD_ID = "mod_tutorial";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.ModItemRegister();
		ModBlocks.ModBlocksRegister();
	}
}
