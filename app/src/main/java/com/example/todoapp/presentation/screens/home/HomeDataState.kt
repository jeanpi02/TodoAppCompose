package com.example.todoapp.presentation.screens.home

import com.example.todoapp.domain.Task

data class HomeDataState(
    val date:String = "",
    val summary:String =  "",
    val completedTask:List<Task> = emptyList(),
    val pendingTask:List<Task> = emptyList(),
)