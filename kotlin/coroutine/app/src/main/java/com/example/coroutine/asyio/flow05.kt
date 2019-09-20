package com.example.coroutine.asyio

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking


fun foooooooooo(): Flow<Int> = flow {
    println("Flow started")
    for (i in 1..3) {
        delay(100)
        emit(i)
    }
}

fun main() = runBlocking<Unit> {
    println("Calling foo ...")
    val flows = foooooooooo()
    flows.collect {
        println(it)
    }
    println("Calling collect again...")
    flows.collect {
        println(it)
    }
}
