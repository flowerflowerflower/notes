package com.example.coroutine.asyio

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.reduce
import kotlinx.coroutines.runBlocking


fun main()= runBlocking {
    val sum=(1..5).asFlow().map{
        it*it
    }.reduce{
        a,b->
        a+b
    }
}