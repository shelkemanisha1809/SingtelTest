package com.singtel.assignment.action;

public interface CanWalk {

    default void walk(){
        System.out.println("I am walking");
    }
}
