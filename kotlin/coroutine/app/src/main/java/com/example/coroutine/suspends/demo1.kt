package com.example.coroutine.suspends

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis


fun main() = runBlocking<Unit> {
    val time = measureTimeMillis {
        val one = doSomethingUserfulOne()
        val two = doSomeThingUserfulTwo()
    }
    println("Completed in $time ms")
}


suspend fun doSomethingUserfulOne(): Int {
    delay(1000L)
    return 13
}

suspend fun doSomeThingUserfulTwo(): Int {
    delay(1000L) // pretend we are doing something useful here, to
    return 29
}

