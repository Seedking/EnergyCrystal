package com.github.seedking

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object EnergyCrystal : ModInitializer {
	private val mod_id = "energycrystal"
    private val logger = LoggerFactory.getLogger(mod_id)

	override fun onInitialize() {
		logger.info("Energy Crystal is deployed !")
	}
}