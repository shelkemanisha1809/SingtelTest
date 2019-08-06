package com.singtel.assignment.birds;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class RoosterTest {

    private ByteArrayOutputStream outContent;
    private Rooster rooster;

    @Before
    public void setUp() {
        rooster = new Rooster();
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testCanSing() {
        rooster.sing();
        String output = "Cock-a-doodle-doo";
        assertEquals(output, outContent.toString().replaceAll("\n", "").replaceAll("\r", ""));
    }

    @Test
    public void testCanFly() {
        rooster.fly();
        String output = "I cannot fly. My wings are clipped";
        assertEquals(output, outContent.toString().replaceAll("\n", "").replaceAll("\r", ""));
    }
}
