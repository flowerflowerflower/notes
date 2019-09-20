package com.example.coroutine.asyio

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun foooooo(): Flow<Int> =flow{
    for(i in 1..3){
        delay(100)
        emit(i)
    }
}

fun main()= runBlocking {
    val time = measureTimeMillis {
     foooooo().buffer().collect{
         delay(300)
         println(it)
     }
    }

    println("time $time")

}