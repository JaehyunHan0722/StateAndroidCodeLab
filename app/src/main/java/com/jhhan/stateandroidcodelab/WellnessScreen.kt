package com.jhhan.stateandroidcodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
//    WaterCounter(modifier)
//    StatefulCounter(modifier = modifier)
    Column(
        modifier = Modifier,
    ) {
        StatefulCounter()
        WellnessTaskList()
    }
}