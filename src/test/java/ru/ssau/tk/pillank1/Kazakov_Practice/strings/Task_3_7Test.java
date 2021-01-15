package ru.ssau.tk.pillank1.Kazakov_Practice.strings;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task_3_7Test {

    @Test
    public void testGetIndexStr() {
        assertEquals(Task_3_7.getIndexStr("Kazakov", "za"), 2);
        assertEquals(Task_3_7.getIndexStr("Kazakov", "n"), -1);
        assertEquals(Task_3_7.getIndexStr("Kazakov", "k"), 4); // регистр решает снова!
    }
}