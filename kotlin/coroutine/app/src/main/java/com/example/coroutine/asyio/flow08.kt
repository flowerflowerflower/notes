package com.example.coroutine.asyio

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking


suspend fun performRequest(request:Int):String{
    delay(1000)
    return "request $ requst"
}

fun main() = runBlocking<Unit> {
    (1..3).asFlow().map{
        request -> performRequest(request)
    }.collect {
        response ->
        println(response)
    }
}

