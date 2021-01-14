package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GenerationOfGeometricProgressionTest {

    @Test
    public void testGetGeometricProgression() {
        double[] progression1 = GenerationOfGeometricProgression.geometricMassive(8,2,2);

        assertEquals(progression1[0],2);
        assertEquals(progression1[5],64);
        assertEquals(progression1[7],256);

        double[] progression2 = GenerationOfGeometricProgression.geometricMassive(5,5,-3);

        assertEquals(progression2[0],5);
        assertEquals(progression2[2],45);
        assertEquals(progression2[3],-135);

        double[] progression3 = GenerationOfGeometricProgression.geometricMassive(6,-17,2);

        assertEquals(progression3[0],-17);
        assertEquals(progression3[3],-136);
        assertEquals(progression3[5],-544);

        double[] progression4 = GenerationOfGeometricProgression.geometricMassive(3,-3,-3);

        assertEquals(progression4[0],-3);
        assertEquals(progression4[1],9);
        assertEquals(progression4[2],-27);

        double[] progression5 = GenerationOfGeometricProgression.geometricMassive(100,10,1);

        assertEquals(progression5[0],10);
        assertEquals(progression5[50],10);
        assertEquals(progression5[77],10);
    }
}
