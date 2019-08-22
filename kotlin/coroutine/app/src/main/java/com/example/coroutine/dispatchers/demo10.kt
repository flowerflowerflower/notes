package com.example.coroutine.dispatchers

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main()= runBlocking<Unit> {
    println("I'm working in thread ${Thread.currentThread().name}")
    launch(Dispatchers.Default+ CoroutineName("test")) {
        println("I'm working in thread ${Thread.currentThread().name}")
    }
}