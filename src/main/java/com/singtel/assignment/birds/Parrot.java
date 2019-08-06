package com.singtel.assignment.birds;

import com.singtel.assignment.animal.Animal;
import com.singtel.assignment.animal.Cat;
import com.singtel.assignment.animal.Dog;

public class Parrot extends Bird {

    private Animal animal;
    public Parrot(Animal animal){
        this.animal = animal;
    }

    @Override
    public void sing(){
        if(animal instanceof Dog){
            System.out.println("Woof Woof");
        }else if(animal instanceof Cat){
            System.out.println("Meow");
        }else if(animal instanceof Rooster){
            System.out.println("Cock-a-doodle-doo");
        }else{
            System.out.println("I cam sing");
        }
    }

}
