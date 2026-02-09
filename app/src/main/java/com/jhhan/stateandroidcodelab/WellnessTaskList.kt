package com.jhhan.stateandroidcodelab

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun WellnessTaskList(
    list: List<WellnessTask>,
    onCheckedTask: (WellnessTask, Boolean) -> Unit,
    modifier: Modifier = Modifier,
//    list: List<WellnessTask> = remember { getWellnessTask() }
    onCloseTask: (WellnessTask) -> Unit,
) {
    LazyColumn(
        modifier = modifier
    ) {
//        items(list) { task ->
//            WellnessTaskItem(taskName = task.label)
//        }
        items(
            items = list,
            key = { task -> task.id }
        ) { task ->
            WellnessTaskItem(
                taskName = task.label,
                checked = task.checked,
                onCheckedChange = { checked -> onCheckedTask(task, checked) },
                onClose = { onCloseTask(task) })
        }
    }
}