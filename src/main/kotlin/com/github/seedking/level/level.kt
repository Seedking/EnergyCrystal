/*
 * This file is part of Energy Crystal, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2023 Seedking
 *
 */

package com.github.seedking.level

import java.awt.Color


data object level {
    private var LEVEL = mutableMapOf<String,IntArray>(
        Pair("NORMAL", intArrayOf(0,0x114514)),
        Pair("COPPER",intArrayOf(1,0x114514)),
        Pair("IRON",intArrayOf(2,0x114514)),
        Pair("GOLD",intArrayOf(3,0x114514)),
        Pair("QUARTZ",intArrayOf(4,0x114514)),
        Pair("DIAMOND",intArrayOf(5,0x114514)),
        Pair("ENDER",intArrayOf(6,0x114514)),
        Pair("HIGHE",intArrayOf(7,0x114514)),
    )

    fun getColor(name: String,vararg rgb:Boolean): Any? {
        if (rgb[0])
            return LEVEL[name]?.get(1)
        else
            return {content:IntArray -> content[1]}
    }
    fun addLevel(name: String, color: IntArray) {
        LEVEL[name] = color
    }
    fun getAllLevel():Map<String,IntArray> {
        return LEVEL
    }
}