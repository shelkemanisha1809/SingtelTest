package com.singtel.assignment.flies;

import com.singtel.assignment.action.CanFly;
import com.singtel.assignment.action.XCanSing;
import com.singtel.assignment.animal.Animal;

public class Butterfly extends Animal implements CanFly, XCanSing {

    private Caterpillar caterpillar;
    public Butterfly(){
        caterpillar = new Caterpillar();
    }
}
