package com.example.coroutine.suspends

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking {

    val time = measureTimeMillis {
        val one = async {
            doSomeThingUserfulTwo()
        }
        val two = async {
            doSomethingUserfulOne()
        }
    }
    println("Completed in $time ms")

}


