package com.singtel.assignment.birds;

public class Rooster extends Bird {

    private Chicken chicken;

    @Override
    public void sing() {
        System.out.print("Cock-a-doodle-doo");
    }

    public Chicken getChicken() {
        return chicken;
    }

    public void setChicken(Chicken chicken) {
        this.chicken = chicken;
    }
}
