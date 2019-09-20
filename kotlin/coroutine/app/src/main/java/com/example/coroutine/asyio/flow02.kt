package com.example.coroutine.asyio

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield


fun fooo():Sequence<Int> = sequence{
    for(i in 1..3){
        Thread.sleep(100)
        yield(i)
    }
}

fun main(){
    fooo().forEach {
        value -> println(value)
    }
}


