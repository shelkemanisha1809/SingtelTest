package com.singtel.assignment.action;

public interface XCanFly {

    default void cannotFly(){
        System.out.println("I am not flying");
    }
}
