package com.patterns.creational.factory.model

class Windows: OS {
    override fun spec() {
        print("deprecated")
    }
}