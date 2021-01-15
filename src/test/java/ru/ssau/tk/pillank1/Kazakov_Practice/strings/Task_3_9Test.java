package ru.ssau.tk.pillank1.Kazakov_Practice.strings;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task_3_9Test {

    @Test
    public void testGetIndexStr() {
        assertEquals(Task_3_9.getIndexStr("Kazakov", "Kaz"), 0);
        assertEquals(Task_3_9.getIndexStr("Kazakova", "va"),-1);
    }
}
