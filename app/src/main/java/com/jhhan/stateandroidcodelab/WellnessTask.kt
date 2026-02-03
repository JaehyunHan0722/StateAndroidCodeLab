package com.jhhan.stateandroidcodelab

data class WellnessTask(val id: Int, val label: String)

fun getWellnessTask() = List(30) { i ->
    WellnessTask(i, "Task # $i")
}