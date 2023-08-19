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


class EnergyCrystalItems {
    //在items中用的
    fun addItem(item: Item, name:String) {
        Data.itemMap[item] = name
    }

    //注册
   fun registerItem() {
        Data.itemMap.forEach {(item, name) ->
            EnergyCrystal.LOGGER.info("注册$name")
            Registry.register(Registries.ITEM, Identifier(EnergyCrystal.MOD_ID, name), item)
        }
   }

   fun EnergyCrystalItems(){
        
   }
}