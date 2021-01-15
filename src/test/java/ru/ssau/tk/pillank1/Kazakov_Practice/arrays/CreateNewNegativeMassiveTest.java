package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CreateNewNegativeMassiveTest {

    @Test
    public void testNegateNewMassive() {
        int[] massive1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] massive2 = CreateNewNegativeMassive.negateNewMassive(massive1);

        assertEquals(massive1, new int[]{1, 2, 3, 4, 5, 6, 7, 8});

        assertEquals(massive2, new int[]{-2, -3, -4, -5, -6, -7, -8, -9});

        assertEquals(CreateNewNegativeMassive.negateNewMassive(massive2), massive1);

        assertEquals(CreateNewNegativeMassive.negateNewMassive(CreateNewNegativeMassive.negateNewMassive(massive2)), massive2);
    }
}
