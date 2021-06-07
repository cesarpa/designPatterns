package com.patterns.creational.factory.model

class OSFactory {
    fun getInstance(type: String): OS =
        when (type) {
            "Open" -> Android()
            "Close" -> Iphone()
            else -> Windows()
        }
}