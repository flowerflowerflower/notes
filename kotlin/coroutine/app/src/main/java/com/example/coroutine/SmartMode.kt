package com.example.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main()= runBlocking {
    //sampleStart
    GlobalScope.launch {

        repeat(1000){
            print("I am  sleeping $ i")
            delay(500L)
        }
    }

    delay(1300L)
}