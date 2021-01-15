package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class OutpuOfStringsTest {

    @Test
    public void testPrintStrings() {
        String[] massive = new String[]{"Kazakov","Nikita", "Nikolaevich"};
        OutpuOfStrings.printStrings(massive);
        /* Вывод в коносль:
        Kazakov
        Nikita
        Nikolaevich
         */
    }
}