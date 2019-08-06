package com.singtel.assignment.action;

public interface CanSing {

    default void sing(){
        System.out.println("I am singing");
    }
}
