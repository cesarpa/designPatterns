package com.patterns.structural.composite

interface Component {
    fun showPrice()
}

class Leaf(
    var price: Int,
    var name: String
) : Component {

    override fun showPrice() {
        println("$name: $price")
    }
}

class Composite(
    var name: String,
    var components: MutableList<Component> = mutableListOf()
) : Component {

    fun addComponent(c: Component) = components.add(c)

    override fun showPrice() {
        println("$name")
        components.forEach {
            it.showPrice()
        }
    }
}