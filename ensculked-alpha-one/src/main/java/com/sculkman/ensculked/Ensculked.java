package com.sculkman.ensculked;

import com.sculkman.ensculked.block.ModBlocks;
import com.sculkman.ensculked.effect.MobEffects;
import com.sculkman.ensculked.entity.ModEntities;
import com.sculkman.ensculked.item.ModItemGroups;
import com.sculkman.ensculked.item.ModItems;
import com.sculkman.ensculked.util.ModLootTableModifiers;
import com.sculkman.ensculked.util.ModModelPredicates;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ensculked implements ModInitializer {
	public static final String MOD_ID = "ensculked";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution
		ModItemGroups.registerItemGroups();
		ModItems.RegisterModItems();
		ModBlocks.registerModBlocks();
		ModLootTableModifiers.ModifyLootTables();
		MobEffects.registerEffects();
		ModModelPredicates.registerModelPredicates();
		ModEntities.RegisterModEntites();

		LOGGER.info("Hello Fabric world!");
	}
}