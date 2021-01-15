package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MultiplyingNumbersInMassiveTest {

    @Test
    public void testMultiplyNumbers() {
        double[] massive1 = new double[]{Double.NaN, Double.NEGATIVE_INFINITY, 1, 3, 8, 1};
        double[] massive2 = new double[]{0, 2, 1, 3, 8, 1, Double.POSITIVE_INFINITY};

        assertEquals(MultiplyingNumbersInMassive.multiplyNumbers(massive1), 24);
        assertEquals(MultiplyingNumbersInMassive.multiplyNumbers(massive2), 48);
    }
}