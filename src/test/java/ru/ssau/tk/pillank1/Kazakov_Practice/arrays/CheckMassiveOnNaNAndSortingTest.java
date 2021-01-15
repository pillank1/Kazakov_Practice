package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CheckMassiveOnNaNAndSortingTest {

    @Test
    public void testSort() {
        Double[] array1 = new Double[]{2d, 1d, Double.NaN};

        CheckMassiveOnNaNAndSorting.sort(array1);

        assertEquals(array1[0].doubleValue(),2d);
        assertEquals(array1[2].doubleValue(),Double.NaN);

        Double[] array2 = new Double[]{3d, 2d, 1d};

        CheckMassiveOnNaNAndSorting.sort(array2);

        assertEquals(array2[0].doubleValue(),1d);
        assertEquals(array2[1].doubleValue(),2d);
        assertEquals(array2[2].doubleValue(),3d);
    }
}