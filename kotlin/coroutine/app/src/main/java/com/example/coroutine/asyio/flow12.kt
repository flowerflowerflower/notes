package com.example.coroutine.asyio

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun zc():Flow<Int> = flow{
    for(i in 1..3){
        delay(100)
        emit(i)//emit next value
    }
}



//fun main() = runBlocking<Unit> {
//
//    val time= measureTimeMillis {
//        zc().conflate().collect{
//            delay(300)
//            println(it)
//        }
//    }
//
//    println("time $time")
//}

fun main()= runBlocking <Unit>{
    val time = measureTimeMillis {
        zc().collectLatest {
            println("Collecting $it")
            delay(300)
            println("Done $it")
        }
    }
}