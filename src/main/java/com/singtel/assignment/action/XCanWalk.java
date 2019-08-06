package com.singtel.assignment.action;

public interface XCanWalk {

    default void cannotWalk(){
        System.out.println("I am not walking");
    }
}
