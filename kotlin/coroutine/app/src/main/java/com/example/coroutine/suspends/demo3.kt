package com.example.coroutine.suspends

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis


fun main() = runBlocking {
    val time = measureTimeMillis {
        val one = async(start = CoroutineStart.LAZY) {
            doSomethingUserfulOne()
        }
        val two = async(start = CoroutineStart.LAZY) {
            doSomeThingUserfulTwo()
        }
        one.start()
        two.start()
        println("The answer is ${one.await() + two.await()}")

    }

    println("Completed in $time ms")

}