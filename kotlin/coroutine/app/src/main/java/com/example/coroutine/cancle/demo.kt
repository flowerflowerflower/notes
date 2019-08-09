package com.example.coroutine.cancle

import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.concurrent.BlockingDeque


fun main() = runBlocking {

     val job = launch {
        repeat(1000) { it ->
            println("job : I am sleep $it ")
            delay(500L)
        }
    }
    delay(1300L)
    println("main: I'm tired of waiting!")
    job.cancelAndJoin()
    println("main: Now I can quit.")

}