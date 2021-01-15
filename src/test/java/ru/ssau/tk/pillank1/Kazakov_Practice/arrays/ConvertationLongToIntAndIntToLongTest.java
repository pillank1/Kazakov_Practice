package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ConvertationLongToIntAndIntToLongTest {

    @Test
    public void testConvert() {
        assertEquals(ConvertationLongToIntAndIntToLong.convertIntToLong(ConvertationLongToIntAndIntToLong.convertLongToInt(1095L)), 1095L);
        assertEquals(ConvertationLongToIntAndIntToLong.convertLongToInt(ConvertationLongToIntAndIntToLong.convertIntToLong(new int[]{10, 15})), new int[]{10, 15});
    }
}
