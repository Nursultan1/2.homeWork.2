package com.company;

public class Main {

    public static void main(String[] args) {
        Mercedes mers=new Mercedes(new Rule(40,"AutoProfi"),new Wheel("265/60R18","Magna Steyr"));
        System.out.println(mers.draw());
        System.out.println(mers.getInfo());
        Ferrari ferrari = new Ferrari(new Rule(41,"AutoProfi"),new Wheel("295/35R20","ItalianStyle"));
        System.out.println(ferrari.draw());
        System.out.println(ferrari.getInfo());
    }
}
