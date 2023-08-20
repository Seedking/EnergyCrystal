/*
 * This file is part of Energy Crystal, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2023 Seedking
 *
 */

package com.github.seedking.items

import com.github.seedking.EnergyCrystal
import net.minecraft.item.Item
import net.minecraft.registry.*
import net.minecraft.util.Identifier


class EnergyCrystalItems(itemMap: ItemMap) {
    var MAP = itemMap.itemMap
    init {

    }

    //在这个文件中用的
    fun addItem(item: Item, name:String) {
        MAP[item] = name
    }

    //注册 在EnergyCrystal中用
   fun registerItem() {
        MAP.forEach {(item, name) ->
            EnergyCrystal.LOGGER.info("注册$name")
            Registry.register(Registries.ITEM, Identifier(EnergyCrystal.MOD_ID, name), item)
        }
   }
}