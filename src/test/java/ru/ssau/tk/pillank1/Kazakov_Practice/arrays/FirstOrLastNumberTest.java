package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FirstOrLastNumberTest {

    @Test
    public void testFirstOrLast() {
        double[] massive1 = new double[]{2, 4, 6, 9, 14, 3};
        double[] massive2 = new double[]{3, 4, 6, 9, 14, 2};

        assertTrue(FirstOrLastNumber.firstOrLast(massive1));
        assertFalse(FirstOrLastNumber.firstOrLast(massive2));
    }
}
