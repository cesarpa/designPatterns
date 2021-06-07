package com.patterns.creational.builder.korlin

import com.patterns.creational.builder.korlin.model.Car
import com.patterns.creational.builder.korlin.model.Phone

class Builder

fun main() {
    // No Needed Patterns because Kotlin have default and named arguments.
    var p = Phone(os = "Android", battery = 5000)
    println(p)

    // Kotlin Implementation https://stackoverflow.com/questions/36140791/how-to-implement-builder-pattern-in-kotlin
    val car = Car.Builder().model("BMW").year(2021).build()
    println(car)
}