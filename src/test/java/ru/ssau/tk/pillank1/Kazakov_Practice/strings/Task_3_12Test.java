package ru.ssau.tk.pillank1.Kazakov_Practice.strings;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task_3_12Test {

    @Test
    public void testGetStr() {
        assertEquals(Task_3_12.getStr("opopopopo", "opo", "po"), "popppo");
        assertEquals(Task_3_12.getStr("kokokooshnik", "ko", "k"), "kkkshnik");
    }
}
