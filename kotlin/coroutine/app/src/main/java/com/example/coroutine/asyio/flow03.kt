package com.example.coroutine.asyio

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


suspend fun foooo(): List<Int> {
    println(System.currentTimeMillis())
    delay(10000)
    println(System.currentTimeMillis())
    return listOf(1, 2, 3)
}


fun main() = runBlocking<Unit> {
    foooo().forEach { value ->
        println(System.currentTimeMillis())
        println(value)
    }
    println("Done")
}