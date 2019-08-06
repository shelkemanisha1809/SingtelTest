package com.singtel.assignment.action;

public interface CanFly {

    default void fly(){
        System.out.println("I am flying");
    }
}
