package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CheckANumberForEvenOrOddParityTest {

    @Test
    public void testCheckNumbers() {
        int[] massive1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] massive2 = new int[]{4, 3, 5, 5, 2, 4, 10, 8, 1};

        assertEquals(CheckANumberForEvenOrOddParity.checkNumbers(massive1), new boolean[]{false, true, false, true, false, true, false, true});
        assertEquals(CheckANumberForEvenOrOddParity.checkNumbers(massive2), new boolean[]{true, false, false, false, true, true, true, true, false});
    }
}
