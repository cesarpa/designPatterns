package com.patterns.behavioral.observer

class Youtube

fun main(){
    var cesarpaCode = Channel()

    var sub1 = Subscriber("cesar")
    var sub2 = Subscriber("anyela")
    var sub3 = Subscriber("santi")
    var sub4 = Subscriber("alex")

    cesarpaCode.subscribe(sub1)
    cesarpaCode.subscribe(sub2)
    cesarpaCode.subscribe(sub3)
    cesarpaCode.subscribe(sub4)

    cesarpaCode.unSubscribe(sub3)

    sub1.subscribeChannel(cesarpaCode)
    sub2.subscribeChannel(cesarpaCode)
    sub3.subscribeChannel(cesarpaCode)
    sub4.subscribeChannel(cesarpaCode)

    cesarpaCode.upload("Single Responsability")
}