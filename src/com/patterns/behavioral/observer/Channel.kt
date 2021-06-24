package com.patterns.behavioral.observer

class Channel : Observer {
    var lastVideo: String? = null
    var subscribers: MutableList<Subscriber> = mutableListOf()

    override fun subscribe(sub: Subscriber) = subscribers.add(sub)

    override fun unSubscribe(sub: Subscriber) = subscribers.remove(sub)

    override fun notifySubscribers() =
        subscribers.forEach {
            it.update()
        }

    override fun upload(title: String) {
        this.lastVideo = title
        notifySubscribers()
    }


}