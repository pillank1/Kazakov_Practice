package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GenerationOfMassiveOfOddNumbersTest {

    @Test
    public void testSetIndex() {
        int[] massive = GenerationOfMassiveOfOddNumbers.setSize(10);

        assertEquals(massive.length,10);

        assertEquals(massive[7],15);
        assertEquals(massive[0],1);
        assertEquals(massive[9],19);
    }
}