package com.singtel.assignment.birds;

public class Rooster extends Bird {

    private Chicken chicken;

    public Rooster() {
        chicken = new Chicken();
    }

    @Override
    public void sing() {
        System.out.println("Cock-a-doodle-doo");
    }

    @Override
    public void fly() {
        chicken.fly();
    }

}
