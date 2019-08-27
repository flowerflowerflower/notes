package com.example.coroutine.asyio

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun zc():Flow<Int> = flow{
    for(i in 1..3){
        delay(100)
        emit(i)//emit next value
    }
}



fun main() = runBlocking<Unit> {

    val time= measureTimeMillis {
        zc().conflate().collect{
            delay(300)
            println()
        }
    }
}