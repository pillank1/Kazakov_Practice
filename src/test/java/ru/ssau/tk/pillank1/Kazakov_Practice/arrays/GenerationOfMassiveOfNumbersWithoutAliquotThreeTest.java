package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GenerationOfMassiveOfNumbersWithoutAliquotThreeTest {

    @Test
    public void testSetSize() {
        double[] massive = GenerationOfMassiveOfNumbersWithoutAliquotThree.setSize(20);

        assertEquals(massive.length,20);

        assertEquals(massive[0],1);
        assertEquals(massive[2],4);
        assertEquals(massive[4],7);
        assertEquals(massive[5],8);
    }
}
