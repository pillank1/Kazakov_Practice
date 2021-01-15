package ru.ssau.tk.pillank1.Kazakov_Practice.strings;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task_3_5Test {

    @Test
    public void testCompareStr() {
        String str1 = "Kazakov";
        String str2 = "kazak";
        String str3 = "Kazak";
        String str4 = "";

        assertTrue(Task_3_5.compareStr(str2, str3));
        assertFalse(Task_3_5.compareStr(str2, str1));
        assertFalse(Task_3_5.compareStr(str2, str4));
    }
}