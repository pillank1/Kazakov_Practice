package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CountingAllEvenNumbersTest {

    @Test
    public void testCountingAmount() {
        double[] massive1 = new double[]{1, -2, 3.1, -4.5, 6};
        double[] massive2 = new double[]{1, 3, 0, 5, 7};
        double[] massive3 = new double[]{1, 3, 2, 5, 7};

        assertEquals(CountingAllEvenNumbers.countingAmount(massive1),2);
        assertEquals(CountingAllEvenNumbers.countingAmount(massive2),1); //0 тоже четный
        assertEquals(CountingAllEvenNumbers.countingAmount(massive3),1);
    }
}
