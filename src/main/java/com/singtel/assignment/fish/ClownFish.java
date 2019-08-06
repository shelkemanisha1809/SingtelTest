package com.singtel.assignment.fish;

public class ClownFish extends Fish {

    private Joke joke;
    public ClownFish(){
        joke = new Joke();
        System.out.println("Small and colorful");
    }
}

class Joke{
    public Joke(){
        System.out.println("Its a joke");
    }
}
