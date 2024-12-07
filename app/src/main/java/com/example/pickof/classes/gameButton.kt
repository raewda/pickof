package com.example.pickof.classes

import androidx.compose.ui.graphics.Color
import com.example.pickof.ui.theme.Biryuzovyi
import com.example.pickof.ui.theme.Seryi
import com.example.pickof.ui.theme.Softblue

open class gameButton(
    val id : Int
){
    object one : gameButton (1)
    object two : gameButton (2)
    object three : gameButton (3)
    object four : gameButton (4)
    object five : gameButton (5)
    object six : gameButton (6)
    object seven : gameButton (7)
    object eight : gameButton (8)
    object nine : gameButton (9)
    object ten : gameButton (10)
    object odinadzat : gameButton (11)
    object dvenadzat : gameButton (12)
    object tridanzat : gameButton (13)
    object chetyrnadzat : gameButton (14)
    object pyatnadzat : gameButton (15)
    object shestnadzat : gameButton (16)
    object semnadzat : gameButton (17)
    object vosemnadzat : gameButton (18)

    companion object {
        const val Count: Int = 18
        private val all = listOf(
            one, two, three, four, five, six, seven, eight, nine,
            ten, odinadzat, dvenadzat, tridanzat, chetyrnadzat,
            pyatnadzat, shestnadzat, semnadzat, vosemnadzat
        )
        fun getById(id: Int): gameButton {
            all.forEach() { el ->
                if (el.id == id) return el
            }
            return one
        }
    }
}



