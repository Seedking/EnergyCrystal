/*
 * This file is part of Energy Crystal, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2023 Seedking
 *
 */

package com.github.seedking

import com.github.seedking.items.Data
import com.github.seedking.items.EnergyCrystalGroup
import com.github.seedking.items.EnergyCrystalItems
import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object EnergyCrystal : ModInitializer {
	const val MOD_ID: String = "energycrystal"
    val LOGGER: Logger = LoggerFactory.getLogger(MOD_ID)


	override fun onInitialize() {
		LOGGER.info("你好 Energy Crystal !")
		val itemData:Data = Data()
		var itemController = EnergyCrystalItems(itemData)
		itemController.registerItem()
		var groupController = EnergyCrystalGroup(itemData)
		groupController.registerGroup()
		groupController.addAllItemToGroup()

		LOGGER.info("Energy Crystal is deployed !")
	}
}