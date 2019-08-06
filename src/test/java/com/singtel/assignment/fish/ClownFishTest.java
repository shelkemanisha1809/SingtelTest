package com.singtel.assignment.fish;

import com.singtel.assignment.birds.Rooster;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.matchers.JUnitMatchers.containsString;

public class ClownFishTest {

    private ByteArrayOutputStream outContent;
    private ClownFish clownFish;

    @Before
    public void setUp() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void should_intiate_joke() {
        clownFish = new ClownFish();
        String output1 = "Its a joke";
        String output2 = "Small and colorful";
        String output = output1 + "\n" + output2;
        assertEquals(outContent.toString().replaceAll("\n", "").replaceAll("\r", ""),
                output.replaceAll("\n", ""));
    }
}
