package com.singtel.assignment;

import com.singtel.assignment.animal.Animal;
import com.singtel.assignment.animal.Cat;
import com.singtel.assignment.animal.Dog;
import com.singtel.assignment.birds.*;
import com.singtel.assignment.fish.Dolphin;
import com.singtel.assignment.flies.Butterfly;
import com.singtel.assignment.flies.Caterpillar;
import com.singtel.assignment.util.AppUtil;

import java.util.Map;

import static com.singtel.assignment.util.AppConstant.*;

public class MainApp {

    public static void main(String[] args) {

        //Q1. Bird
        Bird bird = new Bird();
        bird.fly();
        bird.walk();
        bird.sing();


        //Q2. Duck and Chicken
        Bird chicken = new Chicken();
        chicken.sing();
        chicken.fly();

        Bird duck = new Duck();
        duck.sing();
        ((Duck) duck).swim();

        //Q3. Rooster
        Bird rooster = new Rooster();
        rooster.sing();

        //Q4. Parrot
        new Parrot(new Dog()).sing();
        new Parrot(new Cat()).sing();
        new Parrot(new Rooster()).sing();


        Animal animals[] = new Animal[]{new Cat(), new Chicken(), new Duck(), new Dolphin(), new Butterfly(),
                new Dog(), new Caterpillar(), new Rooster()};
        Map<String, Integer> countValue = AppUtil.countActions(animals);
        System.out.println("fly count is: " + countValue.get(CAN_FLY));
        System.out.println("walk count is: " + countValue.get(CAN_WALK));
        System.out.println("swim count is: " + countValue.get(CAN_SWIM));
        System.out.println("sing count is: " + countValue.get(CAN_SING));

    }


}
