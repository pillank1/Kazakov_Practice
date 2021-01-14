package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CountingAllNumbersOnEvenIndexesInMassiveTest {

    @Test
    public void testCountingAmount() {
        int[] massive1 = new int[]{1, 2, 3, -1, 5, 17, 7};
        int[] massive2 = new int[]{0, 0, 30, 0, 1, -19, 67, 200, 3};
        int[] massive3 = new int[]{1, 3, 3};

        assertEquals(CountingAllNumbersOnEvenIndexesInMassive.countingAmount(massive1), 18);
        assertEquals(CountingAllNumbersOnEvenIndexesInMassive.countingAmount(massive2), 181);
        assertEquals(CountingAllNumbersOnEvenIndexesInMassive.countingAmount(massive3), 3);
    }
}
