package com.patterns.creational.builder.java;

import com.patterns.creational.builder.java.model.Phone;

public class Builder {

    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setOS("IOS").setRam(5).buildPhone();
        System.out.println(p);

    }
}
