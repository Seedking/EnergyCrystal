/*
 * This file is part of Energy Crystal, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2023 Seedking
 *
 */

package com.github.seedking.level

object GlobalLevel {
    var allLevel = mutableListOf(
        Level(0,"NORMAL",0x114514),
        Level(1,"COPPER",0x114514),
        Level(2,"IRON",0x114514),
        Level(3,"GOLD",0x114514),
        Level(4,"QUARTZ",0x114514),
        Level(5,"DIAMOND",0x114514),
        Level(6,"ENDER",0x114514),
        Level(7,"HIGH_ENERGY",0x114514)
    )

    fun addLevel(name: String, color: Int) {
        allLevel += Level(allLevel.last().level, name, color)
    }

    fun getLevel(rank: Int): Level {
        return allLevel[rank]
    }

    fun getName(rank: Int): String {
        return allLevel[rank].name
    }

    fun getColor(rank: Int): Int {
        return allLevel[rank].color
    }

}