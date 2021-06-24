package com.patterns.behavioral.observer

class Subscriber(
    var name: String,
    var channel: Channel? = null
) : Subject {
    override fun update(){
        println("hey $name a video was uploaded ${channel?.lastVideo}" )
    }

    override fun subscribeChannel(ch : Channel){
        channel = ch
    }
}