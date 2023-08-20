/*
 * This file is part of Energy Crystal, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2023 Seedking
 *
 */

package com.github.seedking.items

import net.minecraft.item.Item

class ItemMap {
    var itemMap = HashMap<Item, String>()

    fun addItem(item: Item, name: String) {
        itemMap[item] = name
    }
}
