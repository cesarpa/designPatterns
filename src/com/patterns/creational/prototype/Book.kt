package com.patterns.creational.prototype

class Book(var id: Int, var name: String) {
    override fun toString(): String {
        return "Book(id=$id, name='$name')"
    }
}