package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SearchingOfIndexOfNumberTest {

    @Test
    public void testIndexOfNumber() {
        double[] massive1 = new double[]{1, 2, 3, 4, 5, 6, 7};
        double[] massive2 = new double[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        assertEquals(SearchingOfIndexOfNumber.indexOfNumber(massive1, 5), 4);
        assertEquals(SearchingOfIndexOfNumber.indexOfNumber(massive2, 5), 5);
    }
}
