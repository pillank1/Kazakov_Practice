package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ChangeIndexesOfMinAndMaxNumbersTest {

    @Test
    public void testChangeIndexes() {
        double[] massive1 = new double[]{1, 2, 3, 4, 5, 6, 7};
        double[] massive2 = new double[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        ChangeIndexesOfMinAndMaxNumbers.changeIndexes(massive1);
        assertEquals(massive1, new double[]{7, 2, 3, 4, 5, 6, 1});
        ChangeIndexesOfMinAndMaxNumbers.changeIndexes(massive2);
        assertEquals(massive2, new double[]{1, 9, 8, 7, 6, 5, 4, 3, 2, 10});
    }
}
