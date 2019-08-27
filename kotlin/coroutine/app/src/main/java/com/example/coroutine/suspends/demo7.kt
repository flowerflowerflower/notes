package com.example.coroutine.suspends

import kotlinx.coroutines.*


val threadLocal =ThreadLocal<String?>()//declare thread-local variable


fun main() = runBlocking<Unit> {

    threadLocal.set("main")
    println("Pre-main,current thread:${Thread.currentThread()},Thread local value :'${threadLocal.get()}'")
    val job = launch(Dispatchers.Default+ threadLocal.asContextElement(value="launch")) {
        println("Launch yield,current thread:${Thread.currentThread()},thread local value: '${threadLocal.get()}'")
        yield()
        println("After yield,current thread:${Thread.currentThread()},thread local value: '${threadLocal.get()}'")
    }
    job.join()
    println("Post-main, current thread: ${Thread.currentThread()}, thread local value: '${threadLocal.get()}'")
}
