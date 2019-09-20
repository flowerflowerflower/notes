package com.example.coroutine.asyio

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking


fun main() = runBlocking<Unit> {

    (1..3).asFlow().collect {
        //Convert an integer range to a flow
        delay(100)
        println(it)
    }
}