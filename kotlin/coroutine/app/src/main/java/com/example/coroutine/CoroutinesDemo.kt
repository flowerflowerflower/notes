package com.example.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() {

    GlobalScope.launch {
        //launch a new coroutine in background and continue
        delay(1000L)
        println("World!")
    }
    println("Hello,")// main coroutine continues here immediately
    runBlocking {
        delay(2000L)
    }
}