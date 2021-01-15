package ru.ssau.tk.pillank1.Kazakov_Practice.strings;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task_3_11Test {

    @Test
    public void testGetAmount() {
        String[] arr = new String[]{"Kazakov Nikita", "Kazakova Olga ", "Kazankov Stanislav ", "Kazankova Leysan", "Knyazev"};
        assertEquals(Task_3_11.getAmount(arr, "K", "a"), 2);
        assertEquals(Task_3_11.getAmount(arr, "K", "v"), 2);
    }
}
