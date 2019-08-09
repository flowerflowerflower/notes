package com.example.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main()= runBlocking {
    val job =GlobalScope.launch {
        delay(1000L)
        println("world！")
    }
    println("Hello,")
    job.join()//wait until child  coroutine completes
    println("zc,")
}