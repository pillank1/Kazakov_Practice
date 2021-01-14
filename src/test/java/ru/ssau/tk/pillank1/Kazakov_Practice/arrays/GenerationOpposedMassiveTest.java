package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GenerationOpposedMassiveTest {

    @Test
    public void testSetOpposedMassive() {
        double[] massive = new double[]{1, -2, 3.1, -4.5, 0};

        GenerationOpposedMassive.setOpposedMassive(massive);

        assertEquals(massive, new double[]{-1, 2, -3.1, 4.5, 0});
    }
}