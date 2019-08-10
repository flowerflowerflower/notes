package com.example.coroutine.channel

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.cancelChildren
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.runBlocking


fun main()= runBlocking {

    var cur = numbersFrom(2)

    for (i in 1..10) {

        val prime = cur.receive()

        println(prime)

        cur = filter(cur, prime)

    }

    coroutineContext.cancelChildren() // cancel all children to let main finish
}

fun CoroutineScope.numbersFrom(start: Int) = produce<Int> {

    var x = start

    while (true) send(x++) // infinite stream of integers from start

}

fun CoroutineScope.filter(numbers: ReceiveChannel<Int>, prime: Int) = produce<Int> {

    for (x in numbers) {
        println("x:"+x)
        if (x % prime != 0) send(x)
    }

}




