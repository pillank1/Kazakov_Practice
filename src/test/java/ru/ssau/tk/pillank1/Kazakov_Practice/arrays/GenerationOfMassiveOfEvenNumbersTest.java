package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GenerationOfMassiveOfEvenNumbersTest {

    @Test
    public void testSetSize() {
        int[] massive = GenerationOfMassiveOfEvenNumbers.setSize(8);

        assertEquals(massive.length,8);

        assertEquals(massive[7],2);
        assertEquals(massive[0],16);
        assertEquals(massive[3],10);
    }
}
