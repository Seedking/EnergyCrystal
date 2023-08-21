/*
 * This file is part of Energy Crystal, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2023 Seedking
 *
 */

package com.github.seedking

import com.github.seedking.items.ItemMap
import com.github.seedking.items.GroupBus
import com.github.seedking.items.ItemBus
import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object EnergyCrystal : ModInitializer {
	const val MOD_ID: String = "energycrystal"
    val LOGGER: Logger = LoggerFactory.getLogger(MOD_ID)


	override fun onInitialize() {
		LOGGER.info("你好 Energy Crystal !")
		val itemMap:ItemMap = ItemMap()
		var ecItem = ItemBus(itemMap)
		ecItem.registerItem()
		var ecGroup = GroupBus(itemMap)
		ecGroup.registerGroup()
		ecGroup.addAllItemToGroup()

		LOGGER.info("Energy Crystal is deployed !")
	}
}