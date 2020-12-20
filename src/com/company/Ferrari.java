package com.company;

public class Ferrari extends Car implements Drawable {

    public Ferrari(Rule rule, Wheel wheel) {
        super(rule, wheel, "Ferrari 488 Pista");
    }
    @Override
    public String draw() {
        return "\uD83C\uDFCE";
    }
}
