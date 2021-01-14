package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MassiveOfDividersOfNumberTest {

    @Test
    public void testGetDividersOfNumbers() {
        double[] massive = MassiveOfDividersOfNumber.getDividersOfNumbers(24);

        assertEquals(massive.length, 8, 0.0001);

        assertEquals(massive[0], 1, 0.0001);
        assertEquals(massive[1], 2, 0.0001);
        assertEquals(massive[2], 3, 0.0001);
        assertEquals(massive[3], 4, 0.0001);
        assertEquals(massive[4], 6, 0.0001);
        assertEquals(massive[5], 8, 0.0001);
        assertEquals(massive[6], 12, 0.0001);
        assertEquals(massive[7], 24, 0.0001);

        double[] massive2 = MassiveOfDividersOfNumber.getDividersOfNumbers(16);

        assertEquals(massive2.length, 5, 0.0001);

        assertEquals(massive2[0], 1, 0.0001);
        assertEquals(massive2[1], 2, 0.0001);
        assertEquals(massive2[2], 4, 0.0001);
        assertEquals(massive2[3], 8, 0.0001);
        assertEquals(massive2[4], 16, 0.0001);
    }
}