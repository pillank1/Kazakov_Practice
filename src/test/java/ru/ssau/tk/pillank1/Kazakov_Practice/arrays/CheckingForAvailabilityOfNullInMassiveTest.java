package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CheckingForAvailabilityOfNullInMassiveTest {

    @Test
    public void testCheck() {
        Integer[] massive1 = new Integer[]{1, 2, 3, 4};
        Integer[] massive2 = new Integer[]{1, null, 3, 4};

        assertFalse(CheckingForAvailabilityOfNullInMassive.check(massive1));
        assertTrue(CheckingForAvailabilityOfNullInMassive.check(massive2));
    }
}