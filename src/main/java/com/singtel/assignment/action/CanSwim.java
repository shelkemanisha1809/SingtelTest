package com.singtel.assignment.action;

public interface CanSwim {

    default void swim(){
        System.out.println("I am swimming");
    }
}
