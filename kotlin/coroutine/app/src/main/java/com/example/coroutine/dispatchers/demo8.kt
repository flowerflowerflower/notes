package com.example.coroutine.dispatchers

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() = runBlocking<Unit> {
    val request = launch {
        repeat(6) {
            launch {
                delay((it + 1) * 200L)
                println("Coroutine $it  is done")
            }
        }
        println("request:I am done and I do not explicitly join my children that are still active ")
    }

   // request.join()
    println(" new processing of the request is complete")
}