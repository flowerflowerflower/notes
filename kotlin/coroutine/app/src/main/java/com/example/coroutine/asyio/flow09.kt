package com.example.coroutine.asyio

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.runBlocking


fun numbers(): Flow<Int> = flow {

    try {
        emit(1)
        emit(2)
        println("This line will not execute")
        emit(3)
    } finally {
        println("Finally in numbers")
    }
}

fun main()= runBlocking {
    numbers().take(2).collect {
        println(it)
    }
}