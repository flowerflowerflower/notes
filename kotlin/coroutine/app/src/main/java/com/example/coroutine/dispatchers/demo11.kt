package com.example.coroutine.dispatchers

import kotlinx.coroutines.*


class Activity : CoroutineScope by CoroutineScope(Dispatchers.Default) {

    fun destroy() {
        cancel()
    }

    fun doSomething() {
        println("Activity V1" + Thread.currentThread().name)
        repeat(30) { i ->
            launch {
                delay((i + 1) * 1000L)
                println("Activity V2" + Thread.currentThread().name)

            }
        }
    }
}


fun main() = runBlocking<Unit> {
    val activity = Activity()
    println("Activity" + Thread.currentThread().name)
    activity.doSomething()
    println("Launched coroutines")
    delay(500L)
    println("Destroying activity!")
    activity.destroy() // cancels all coroutines
    delay(1000) // visually confirm that they don't work

}