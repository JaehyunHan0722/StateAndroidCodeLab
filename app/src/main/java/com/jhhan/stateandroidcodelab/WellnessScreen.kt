package com.jhhan.stateandroidcodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
//    WaterCounter(modifier)
//    StatefulCounter(modifier = modifier)
    Column(
        modifier = Modifier,
    ) {
        StatefulCounter()
//        WellnessTaskList()
        val list = remember { getWellnessTask().toMutableStateList() }
        WellnessTaskList(
            list = list,
            onCloseTask = { task -> list.remove(task) })
    }
}

fun getWellnessTask() = List(30) { i ->
    WellnessTask(i, "Task # $i")
}