package com.singtel.assignment.birds;

import com.singtel.assignment.action.CanSwim;

public class Duck extends Bird implements CanSwim {

    @Override
    public void sing() {
        System.out.println("Quack Quack");
    }
}
