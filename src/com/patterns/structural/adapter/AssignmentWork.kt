package com.patterns.structural.adapter

class AssignmentWork( var p: Pen? = null) {



    fun writeAssignment(s: String) {
        p?.write(s)
    }
}