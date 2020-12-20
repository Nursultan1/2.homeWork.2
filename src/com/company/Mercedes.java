package com.company;

public class Mercedes  extends  Car implements Drawable{
    public Mercedes(Rule rule, Wheel wheel) {
        super(rule, wheel,"Mercedes-Benz G-Класс AMG");
    }

    @Override
    public String draw() {
        return "\uD83D\uDE98";
    }
}
