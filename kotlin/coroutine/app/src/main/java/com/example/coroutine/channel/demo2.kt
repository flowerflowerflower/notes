package com.example.coroutine.channel

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main()= runBlocking {
    val channel = Channel<Int>()

    launch {
        for(x in 1..5) {
            delay(200L)
            channel.send(x * x)
        }
        channel.close()
    }

    for(y in channel) print(y)
    println("Done")
}