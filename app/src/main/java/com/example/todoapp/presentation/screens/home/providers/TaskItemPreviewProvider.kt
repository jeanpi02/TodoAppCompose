package com.example.todoapp.presentation.screens.home.providers

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.example.todoapp.domain.Category.OTHER
import com.example.todoapp.domain.Category.WORK
import com.example.todoapp.domain.Task

class TaskItemPreviewProvider:PreviewParameterProvider<Task> {
    override val values: Sequence<Task>
        get() = sequenceOf(
            Task(
                id = "1",
                title = "Task 1",
                isCompleted = false,
                description = "Description 1",
                category = WORK,
            ),

            Task(
                id = "2",
                title = "Task 2",
                isCompleted = true,
                description = "Description 2",
                category = OTHER,
            ),
        )
}