package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GenerationOfMassiveOfFibonacciNumbersTest {

    @Test
    public void testSetSize() {
        int[] massive = GenerationOfMassiveOfFibonacciNumbers.setSize(20);

        assertEquals(massive.length,20);

        assertEquals(massive[4],3);
        assertEquals(massive[0],0);
        assertEquals(massive[10],55);
    }
}