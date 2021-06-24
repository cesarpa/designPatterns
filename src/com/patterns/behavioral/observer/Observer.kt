package com.patterns.behavioral.observer

interface Observer {
    fun subscribe(sub: Subscriber): Boolean
    fun unSubscribe(sub: Subscriber): Boolean
    fun notifySubscribers()
    fun upload(title: String)
}