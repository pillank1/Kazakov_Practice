package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GenerationSymmetricMassiveTest {

    @Test
    public void testGetNumber() {
        assertEquals(GenerationSymmetricMassive.getNumber(10), new int[]{1, 2, 3, 4, 5, 5, 4, 3, 2, 1});
        assertEquals(GenerationSymmetricMassive.getNumber(7), new int[]{1, 2, 3, 4, 3, 2, 1});
    }
}
