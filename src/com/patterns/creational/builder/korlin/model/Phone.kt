package com.patterns.creational.builder.korlin.model

class Phone(
    var os: String? = null,
    var processor: String? = null,
    var screenSize: Double? = null,
    var battery: Int? = null,
    var camera: Int? = null
) {
    override fun toString(): String {
        return "Phone(os=$os, processor=$processor, screenSize=$screenSize, battery=$battery, camera=$camera)"
    }
}