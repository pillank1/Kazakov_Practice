package ru.ssau.tk.pillank1.Kazakov_Practice.strings;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task_3_8Test {

    @Test
    public void testGetIndexStr() {
        assertEquals(Task_3_8.getIndexStr("Kazakov", "Kaz"), -1);
        assertEquals(Task_3_8.getIndexStr("Kazakova", "va"),6);
    }
}