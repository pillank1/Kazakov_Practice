package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CheckingForAvailabilityOfNumberInMassiveTest {

    @Test
    public void testCheck() {
        double[] massive = new double[]{1, 2, 3, 4, 5,-6, -7, -8, -9, -10};

        assertEquals(CheckingForAvailabilityOfNumberInMassive.check(massive, 1), true);
        assertEquals(CheckingForAvailabilityOfNumberInMassive.check(massive, -2), false);
        assertEquals(CheckingForAvailabilityOfNumberInMassive.check(massive, 6), false);
        assertEquals(CheckingForAvailabilityOfNumberInMassive.check(massive, -7), true);
    }
}
