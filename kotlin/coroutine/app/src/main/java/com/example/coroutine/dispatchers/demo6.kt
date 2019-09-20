package com.example.coroutine.dispatchers

import kotlinx.coroutines.Job
import kotlinx.coroutines.runBlocking


fun main()= runBlocking<Unit> {

    println("My job is ${coroutineContext[Job]}")
}