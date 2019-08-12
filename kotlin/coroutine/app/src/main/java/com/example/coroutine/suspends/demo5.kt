package com.example.coroutine.suspends

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis


fun main() = runBlocking {
    val time = measureTimeMillis {
        println("The answer is ${concurrentSum()}")
    }

    println("Completed in $time ms")
}


suspend fun concurrentSum(): Int = coroutineScope {

    val one = async { doSomethingUsefulOOne() }
    val two = async { doSomethingUserfulTwo() }

    one.await() + two.await()
}


suspend fun doSomethingUsefulOOne(): Int {

    delay(1000L) // pretend we are doing something useful here
    return 13
}


suspend fun doSomethingUserfulTwo(): Int {

    delay(1000L)
    return 29
}