package com.example.coroutine.suspends

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis


fun main() {

    val time = measureTimeMillis {

        val one = somethingUserfulOneAsync()
        val two = somethingUserfulTwoAsync()

        runBlocking {
            println("The answer is ${one.await() + two.await()}")
        }
    }

    println("Completed in $time ms")

}


fun somethingUserfulOneAsync() = GlobalScope.async {
    doSomethingUsefulOne()
}

fun somethingUserfulTwoAsync() = GlobalScope.async {
    doSomethingUsefulTwo()
}


suspend fun doSomethingUsefulOne(): Int {

    delay(1000L) // pretend we are doing something useful here

    return 13

}

suspend fun doSomethingUsefulTwo(): Int {

    delay(1000L) // pretend we are doing something useful here, too

    return 29

}





