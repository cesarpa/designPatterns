package com.patterns.creational.factory

import com.patterns.creational.factory.model.Android
import com.patterns.creational.factory.model.OS
import com.patterns.creational.factory.model.OSFactory

class FactoryMain

fun main(){
    var factory :OSFactory = OSFactory()
    var os: OS = factory.getInstance("lol")
    os.spec();
}