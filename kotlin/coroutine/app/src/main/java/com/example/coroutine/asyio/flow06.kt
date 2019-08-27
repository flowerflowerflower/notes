package com.example.coroutine.asyio

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import kotlinx.coroutines.withTimeoutOrNull


fun foooooooo(): Flow<Int> =flow{
    for(i in 1..3){
        delay(100)
        println("Emitting $i")
        emit(i)
    }
}

fun main()= runBlocking {
    withTimeoutOrNull(250){
         foooooooooo().collect(){
             println(""+it)
         }
    }

    println("Done")
}