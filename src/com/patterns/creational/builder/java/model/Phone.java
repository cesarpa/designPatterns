package com.patterns.creational.builder.java.model;

public class Phone {

    private String os;
    private int ram;
    private double screenSize;

    public Phone(String os, int ram, double screenSize) {
        this.os = os;
        this.ram = ram;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", screenSize=" + screenSize +
                '}';
    }
}
