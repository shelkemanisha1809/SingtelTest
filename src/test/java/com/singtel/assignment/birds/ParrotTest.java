package com.singtel.assignment.birds;

import com.singtel.assignment.animal.Animal;
import com.singtel.assignment.animal.Cat;
import com.singtel.assignment.animal.Dog;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ParrotTest {

    private ByteArrayOutputStream outContent;
    private Parrot parrot;
    private Animal animal;

    @Before
    public void setUp() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void should_parrot_sound_as_dog() {
        animal = new Dog();
        parrot = new Parrot(animal);
        parrot.sing();
        String output = "Woof Woof";
        assertEquals(output,  outContent.toString().replaceAll("\n", "").replaceAll("\r", ""));
    }

    @Test
    public void should_parrot_sound_as_cat() {
        animal = new Cat();
        parrot = new Parrot(animal);
        parrot.sing();
        String output = "Meow";
        assertEquals(output,  outContent.toString().replaceAll("\n", "").replaceAll("\r", ""));
    }

    @Test
    public void should_parrot_sound_as_rooster() {
        animal = new Rooster();
        parrot = new Parrot(animal);
        parrot.sing();
        String output = "Cock-a-doodle-doo";
        assertEquals(output, outContent.toString().replaceAll("\n", "").replaceAll("\r", ""));
    }
}
