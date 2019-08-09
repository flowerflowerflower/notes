package com.example.coroutine.cancle

import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Cancellation is cooperation
 */

fun main() = runBlocking {

    val startTime = System.currentTimeMillis()
    val job = launch {
        var nextPrintTime = startTime
        var i = 0
        while (i < 5) {
            if (System.currentTimeMillis() >= nextPrintTime) {
                println("Job: I am sleeping ${i++}...")
                nextPrintTime += 500L
            }
        }
    }

    delay(1300L) //等待一段时间
    println("main: I'm tired of waiting!")
    job.cancelAndJoin()
    println("main: Now I can quit.")
}


