package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CreateTwoDimensionalNaturalMassiveTest {

    @Test
    public void testCreateNaturalMassive() {
        assertEquals(CreateTwoDimensionalNaturalMassive.createNaturalMassive(3), new int[][]{{1, 2, 3}, {4,5}, {6}});
        assertEquals(CreateTwoDimensionalNaturalMassive.createNaturalMassive(5), new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {10, 11, 12}, {13, 14}, {15}});
        assertEquals(CreateTwoDimensionalNaturalMassive.createNaturalMassive(1), new int[][]{{1}});
    }
}
