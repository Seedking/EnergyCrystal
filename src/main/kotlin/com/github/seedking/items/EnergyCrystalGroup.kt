/*
 * This file is part of Energy Crystal, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2023 Seedking
 *
 */

package com.github.seedking.items

import com.github.seedking.EnergyCrystal
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.*
import net.minecraft.registry.*
import net.minecraft.text.Text
import net.minecraft.util.Identifier

class EnergyCrystalGroup(data: Data) {
    private var internal_data: Data = Data()

    init {
        internal_data.itemMap = data.itemMap
    }

    private val ENERGYCRYSTAL_GROUP:RegistryKey<ItemGroup> = RegistryKey.of(
        RegistryKeys.ITEM_GROUP,
        Identifier(EnergyCrystal.MOD_ID,"group.main")
    )

    private fun addItemToGroup(group:RegistryKey<ItemGroup> ,item:Item) {
        EnergyCrystal.LOGGER.info("添加物品${item.name.content} -> ${group.value}")
        ItemGroupEvents.modifyEntriesEvent(group).register{
            content:FabricItemGroupEntries -> content.add(item)
        }
    }

    //在EnergyCrystal中使用 先注册再添加
    fun registerGroup() {
        EnergyCrystal.LOGGER.info("注册物品组 ${ENERGYCRYSTAL_GROUP.value}")
        Registry.register(Registries.ITEM_GROUP, ENERGYCRYSTAL_GROUP, FabricItemGroup.builder()
            .displayName(Text.translatable("${EnergyCrystal.MOD_ID}.group.main"))
            .build()
        )
    }

    fun addAllItemToGroup() {
        internal_data.itemMap.forEach{(item, name) ->
            addItemToGroup(ENERGYCRYSTAL_GROUP, item)
        }
    }
}