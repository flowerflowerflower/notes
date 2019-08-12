package com.example.coroutine.cancle

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull


fun main() = runBlocking {
    val result = withTimeoutOrNull(1300L) {
        repeat(1000) { i ->
            println(
                "I'm sleeping $i ..."
            )
            delay(500L)
        }

        println("withTimeoutOrNull")
        "Done"
    }

    println("Result is $result")
}