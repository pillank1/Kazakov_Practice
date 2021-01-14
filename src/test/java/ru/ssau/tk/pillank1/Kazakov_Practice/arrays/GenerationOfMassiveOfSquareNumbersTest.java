package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GenerationOfMassiveOfSquareNumbersTest {

    @Test
    public void testSetSize() {
        int[] arr = GenerationOfMassiveOfSquareNumbers.setSize(23);

        assertEquals(arr.length,23);

        assertEquals(arr[0],0);
        assertEquals(arr[7],49);
        assertEquals(arr[15],225);
    }
}
