package com.patterns.prototype

class Prototype

fun main() {
    var bs = BookShop("Novelty");
    bs.loadData()

    var bs2 = bs.clone()
    bs.books.removeAt(1)
    bs2.name = "A1"

    println(bs)
    println(bs2)
}