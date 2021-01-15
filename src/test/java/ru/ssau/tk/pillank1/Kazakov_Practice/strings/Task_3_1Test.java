package ru.ssau.tk.pillank1.Kazakov_Practice.strings;

import org.testng.annotations.Test;

public class Task_3_1Test {

    @Test
    public void testSetString() {
        String str = "Vse vse ponimayut.";

        Task_3_1.setString(str);
        /* Вывод в консооль:
        V
        s
        e

        v
        s
        e

        p
        o
        n
        i
        m
        a
        y
        u
        t
        .
         */
    }
}