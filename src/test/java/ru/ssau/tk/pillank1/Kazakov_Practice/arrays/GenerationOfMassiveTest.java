package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GenerationOfMassiveTest {

    @Test
    public void testGetIndex() {
        int[] array = new GenerationOfMassive().getIndex(10);
        assertEquals(array.length,10);
        assertEquals(array[0],2);
        assertEquals(array[9],2);
        assertEquals(array[6],1);
    }
}
