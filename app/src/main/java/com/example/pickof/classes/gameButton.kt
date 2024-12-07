package com.example.pickof.classes

import androidx.compose.ui.graphics.Color
import com.example.pickof.ui.theme.Biryuzovyi
import com.example.pickof.ui.theme.Seryi
import com.example.pickof.ui.theme.Softblue
import kotlin.random.Random

open class gameButton(
    val id : Int,
    val colorstart : Color,
    val colorpick : Color,
    val colorend : Color
){
    object one : gameButton (1, Biryuzovyi, Seryi, Softblue)
    object two : gameButton (2, Biryuzovyi, Seryi, Softblue)
    object three : gameButton (3, Biryuzovyi, Seryi, Softblue)
    object four : gameButton (4, Biryuzovyi, Seryi, Softblue)
    object five : gameButton (5, Biryuzovyi, Seryi, Softblue)
    object six : gameButton (6, Biryuzovyi, Seryi, Softblue)
    object seven : gameButton (7, Biryuzovyi, Seryi, Softblue)
    object eight : gameButton (8, Biryuzovyi, Seryi, Softblue)
    object nine : gameButton (9, Biryuzovyi, Seryi, Softblue)

    companion object {
        const val Count: Int = 5
        private val all = listOf(
            one, two, three, four, five, six, seven, eight, nine
        )
        fun getById(id: Int): gameButton {
            all.forEach() { el ->
                if (el.id == id) return el
            }
            return one
        }
    }
}



