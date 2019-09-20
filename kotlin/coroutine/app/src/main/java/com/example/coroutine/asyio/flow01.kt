package com.example.coroutine.asyio


fun foo(): List<Int> {
    return listOf<Int>(1, 2, 3)
}


fun main() {
    foo().forEach { value ->
        println(value)
    }
}
