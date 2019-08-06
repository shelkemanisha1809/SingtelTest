package com.singtel.assignment.action;

public interface XCanSing {

    default void cannotSing(){
        System.out.println("I am not singing");
    }
}
