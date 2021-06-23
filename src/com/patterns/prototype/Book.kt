package com.patterns.prototype

class Book(var id: Int, var name: String) {
    override fun toString(): String {
        return "Book(id=$id, name='$name')"
    }
}