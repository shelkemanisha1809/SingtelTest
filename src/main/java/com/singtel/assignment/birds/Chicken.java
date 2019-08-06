package com.singtel.assignment.birds;

public class Chicken extends Bird {

    @Override
    public void sing() {
        System.out.println("Cluck Cluck");
    }

    @Override
    public void fly() {
        System.out.println("I cannot fly. My wings are clipped");
    }
}
