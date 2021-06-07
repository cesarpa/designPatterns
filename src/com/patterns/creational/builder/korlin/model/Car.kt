package com.patterns.creational.builder.korlin.model

class Car(
    val model: String?,
    val year: Int
) {
    private constructor(builder: Builder): this(builder.model, builder.year)

    class Builder {
        var model: String? = null
            private set

        var year: Int = 0
            private set

        fun model(model: String?): Builder {
            this.model = model
            return this
        }

        // shorter
        fun year(year: Int): Builder = apply { this.year = year }

        fun build() = Car(this)
    }

    override fun toString(): String {
        return "Car(model=$model, year=$year)"
    }


}