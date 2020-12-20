package com.company;

public class Car {
    private Rule rule;
    private Wheel wheel;
    private String carName;

    public Car(Rule rule, Wheel wheel, String carName) {
        this.rule = rule;
        this.wheel = wheel;
        this.carName = carName;
    }

    public Rule getRule() {
        return rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
    public String getInfo(){
        return "Марка машины-"+ carName+
                " Руль-"+" {Размер Руля-"+ rule.getRuleSize()+",Название Компании-"+rule.getCompanyName()+"}"+
                " Колесо-"+" {Размер Колеса-"+wheel.getWheelSize()+",Название Компании-"+wheel.getCompanyName()+"}";

    }
}
