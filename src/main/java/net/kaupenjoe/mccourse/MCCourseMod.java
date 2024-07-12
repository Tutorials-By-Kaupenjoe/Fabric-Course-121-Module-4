package net.kaupenjoe.mccourse;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.kaupenjoe.mccourse.block.ModBlocks;
import net.kaupenjoe.mccourse.item.ModItemGroups;
import net.kaupenjoe.mccourse.item.ModItems;
import net.minecraft.block.ComposterBlock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 600);

		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.STRAWBERRY, 0.5f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.STRAWBERRY_SEEDS, 0.25f);
	}
}