/*
 * This file is part of Energy Crystal, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2023 Seedking
 *
 */

package com.github.seedking.level

import java.awt.Color


data object level {
    private var LEVEL = mutableMapOf<String,Int>(
        Pair("NORMAL",0x114514),
        Pair("COPPER",0x114514),
        Pair("IRON",0x114514),
        Pair("GOLD",0x114514),
        Pair("QUARTZ",0x114514),
        Pair("DIAMOND",0x114514),
        Pair("ENDER",0x114514),
        Pair("HIGHE",0x114514),
    )

    fun getColor(name: String):Int? {
        return LEVEL[name]
    }
    fun addLevel(name: String, color: Int) {
        LEVEL[name] = color
    }
    fun allLevel():Map<String,Int> {
        return LEVEL
    }
}