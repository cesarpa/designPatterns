package com.patterns.behavioral.observer

interface Subject {
    fun update()
    fun subscribeChannel(ch: Channel)
}