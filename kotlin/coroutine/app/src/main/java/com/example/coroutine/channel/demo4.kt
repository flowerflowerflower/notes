package com.example.coroutine.channel

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


suspend  fun   CoroutineScope.produceSquares():ReceiveChannel<Int> = produce{
    println("开始!")
    for (x in 1..5) send(x * x)
    delay(1000L)
    println("开始1!")
    for (x in 1..5) send(x * x)

}

fun main() = runBlocking {
    val squares = produceSquares();
    squares.consumeEach {
       println(it)
    }

    println("Done!")
}