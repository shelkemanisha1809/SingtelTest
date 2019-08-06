package com.singtel.assignment.action;

public interface XCanSwim {

    default void cannotSwim(){
        System.out.println("I am not swimming");
    }
}
