package com.patterns.structural.adapter

import com.patterns.structural.adapter.friend.Marker

class PenAdapter(var m:Marker) : Pen{

    override fun write(s: String) {
        m.mark(s)
    }
}