package com.example.coroutine

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main()= runBlocking {

    launch {
     doWorld()
    }
    coroutineScope{
        launch {
            delay(1000L)
            doWorld()
        }
    }
    println("Hello,")
}


suspend fun doWorld(){
    delay(1000L)
    println("world!")
}