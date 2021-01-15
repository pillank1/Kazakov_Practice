package ru.ssau.tk.pillank1.Kazakov_Practice.strings;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task_3_2Test {

    @Test
    public void testConvertToBytes() {
        String str1 = "String";
        String str2 = "Строка";
        String str3 = "Строка String";

        Task_3_2.convertToBytes(str1);
        Task_3_2.convertToBytes(str2);
        /* Вывод в консоль:
        83
        116
        114
        105
        110
        103
        -48
        -95
        -47
        -126
        -47
        -128
        -48
        -66
        -48
        -70
        -48
        -80
        */
    }
}