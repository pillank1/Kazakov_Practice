package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SearchingMaximalNumberInMassiveTest {

    @Test
    public void testMaxNumberMassif() {
        int[] massive1 = new int[]{1, 2, 8, 4, 7, 6, 8};
        int[] massive2 = new int[]{};
        int[] massive3 = new int[]{1, 4, 3, 3 , 4, 10, -11, 18, -1000};

        assertEquals(SearchingMaximalNumberInMassive.maxNumberMassif(massive1), (Integer) 8);
        assertNull(SearchingMaximalNumberInMassive.maxNumberMassif(massive2));
        assertEquals(SearchingMaximalNumberInMassive.maxNumberMassif(massive3), (Integer) 18);
    }
}
