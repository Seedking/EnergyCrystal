/*
 * This file is part of Energy Crystal, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2023 Seedking
 *
 */

package com.github.seedking.level

import com.github.seedking.util.Rgb


data class Level(val levelRank: Int, val levelName: String, val levelColor: Int) {
    val level = levelRank
    val name = levelName
    val color = levelColor

    fun getAll(): Level {
        return Level(level, name, color)
    }

    fun getColorRgb(): Rgb {
        return Rgb(
            color ushr 16 and 0xFF,
            color shr 8 and 0xFF,
            color and 0xFF
        )
    }
}