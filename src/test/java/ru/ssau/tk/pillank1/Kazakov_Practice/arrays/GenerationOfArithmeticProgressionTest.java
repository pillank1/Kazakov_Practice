package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GenerationOfArithmeticProgressionTest {

    @Test
    public void testArithmeticMassive() {
        GenerationOfArithmeticProgression massive = new GenerationOfArithmeticProgression();

        assertEquals(massive.arithmeticMassive(4, 3, 7), new int[]{3, 10, 17, 24});
        assertEquals(massive.arithmeticMassive(5, 2, -10), new int[]{2, -8, -18, -28, -38});
        assertEquals(massive.arithmeticMassive(3, -120, 40), new int[]{-120, -80, -40});
    }
}