package com.example.coroutine.result

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() = runBlocking<Unit> {
    launch {
        println("main runBlocking : ${Thread.currentThread().name}")

    }

    launch(Dispatchers.Unconfined) {
        println("Unconfined : I am working in thread ${Thread.currentThread().name}")
    }


    launch(Dispatchers.Default) {
        println("Default  : I am working in thread ${Thread.currentThread().name}")

        launch(Dispatchers.IO) {
            println("IO  : I am working in thread${Thread.currentThread().name} ")
        }

    }


}