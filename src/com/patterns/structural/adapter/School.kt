package com.patterns.structural.adapter

import com.patterns.structural.adapter.friend.Marker

class School {
}

fun main(){
    // Structural Pattern
    // cannot use the marker directly We'll create and adapter
    var m = Marker()

    var pa: PenAdapter = PenAdapter(m)

    var aw = AssignmentWork(pa)
    aw.writeAssignment("I need write some code in paper");
}