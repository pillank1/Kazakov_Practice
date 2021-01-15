package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CreateNegativeMassiveTest {

    @Test
    public void testNegateMassive() {
        int[] massive1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        CreateNegativeMassive.negateMassive(massive1);
        assertEquals(massive1, new int[]{-2, -3, -4, -5, -6, -7, -8, -9});

        CreateNegativeMassive.negateMassive(massive1);
        assertEquals(massive1, new int[]{1, 2, 3, 4, 5, 6, 7, 8});

        CreateNegativeMassive.negateMassive(massive1);
        CreateNegativeMassive.negateMassive(massive1);
        assertEquals(massive1, new int[]{1, 2, 3, 4, 5, 6, 7, 8});

        int[] massive2 = new int[]{-1, 2, -3, 4, -5, 6, -7, 8};

        CreateNegativeMassive.negateMassive(massive2);
        assertEquals(massive2, new int[]{0, -3, 2, -5, 4, -7, 6, -9});

        CreateNegativeMassive.negateMassive(massive2);
        assertEquals(massive2, new int[]{-1, 2, -3, 4, -5, 6, -7, 8});

        CreateNegativeMassive.negateMassive(massive2);
        CreateNegativeMassive.negateMassive(massive2);
        assertEquals(massive2, new int[]{-1, 2, -3, 4, -5, 6, -7, 8});
    }
}