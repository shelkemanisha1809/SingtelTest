package com.singtel.assignment;

import com.singtel.assignment.action.CanFly;
import com.singtel.assignment.action.CanSing;
import com.singtel.assignment.action.CanSwim;
import com.singtel.assignment.action.CanWalk;
import com.singtel.assignment.animal.Animal;
import com.singtel.assignment.animal.Cat;
import com.singtel.assignment.animal.Dog;
import com.singtel.assignment.birds.*;
import com.singtel.assignment.fish.Dolphin;
import com.singtel.assignment.flies.Butterfly;
import com.singtel.assignment.flies.Caterpillar;

import java.util.HashMap;
import java.util.Map;

public class MainApp {

    private static String CAN_WALK = "CanWalk";
    private static String CAN_FLY = "CanFly";
    private static String CAN_SWIM = "CanSwim";
    private static String CAN_SING = "CanSing";

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
        Map<String, Integer> countValue = countActions(animals);
        System.out.println("fly count is: " + countValue.get(CAN_FLY));
        System.out.println("walk count is: " + countValue.get(CAN_WALK));
        System.out.println("swim count is: " + countValue.get(CAN_SWIM));
        System.out.println("sing count is: " + countValue.get(CAN_SING));

    }

    private static Map<String, Integer> countActions(Animal[] animals) {
        Map<String, Integer> actionCountMap = new HashMap<>();
        for (Animal animal : animals) {
            if (animal instanceof CanFly) {
                actionCountMap.put(CAN_FLY, getCount(actionCountMap, CAN_FLY));
            }
            if (animal instanceof CanWalk) {
                actionCountMap.put(CAN_WALK, getCount(actionCountMap, CAN_WALK));
            }
            if (animal instanceof CanSing) {
                actionCountMap.put(CAN_SING, getCount(actionCountMap, CAN_SING));
            }
            if (animal instanceof CanSwim) {
                actionCountMap.put(CAN_SWIM, getCount(actionCountMap, CAN_SWIM));
            }
        }
        return actionCountMap;
    }

    private static Integer getCount(Map<String, Integer> actionCountMap, String action) {
        return actionCountMap.get(action) != null ?
                actionCountMap.get(action) + 1 : 1;
    }
}
