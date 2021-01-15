package ru.ssau.tk.pillank1.Kazakov_Practice.strings;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task_3_10Test {

    @Test
    public void testGetAmount() {
        String[] arr = new String[]{"Kazakov", "Kazakova", "Kazankov", "Kazankova", "Knyazev"};
        assertEquals(Task_3_10.getAmount(arr, "K", "a"), 2);
        assertEquals(Task_3_10.getAmount(arr, "K", "v"), 3);
    }
}
