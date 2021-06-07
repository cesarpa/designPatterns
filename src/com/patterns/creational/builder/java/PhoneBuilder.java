package com.patterns.creational.builder.java;

import com.patterns.creational.builder.java.model.Phone;

public class PhoneBuilder {

    private String os;
    private int ram;
    private double screenSize;

    public PhoneBuilder setOS(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public Phone buildPhone(){
        return new Phone(os, ram ,screenSize);
    }
}
