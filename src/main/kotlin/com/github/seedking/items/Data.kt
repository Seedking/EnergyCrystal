/*
 * This file is part of Energy Crystal, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2023 Seedking
 *
 */

package com.github.seedking.items

import net.minecraft.item.Item

data object Data {
    var itemMap = HashMap<Item, String>()
    var level= arrayOf<String>("COPPER","IRON","GOLD","QUARTZ","DIAMOND","ENDER","HIGHE")
}
