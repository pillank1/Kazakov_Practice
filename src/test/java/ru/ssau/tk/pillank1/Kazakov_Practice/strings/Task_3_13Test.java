package ru.ssau.tk.pillank1.Kazakov_Practice.strings;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task_3_13Test {

    @Test
    public void testGetNewStr() {
        String str = "Road to the dream";
        int maxSizeStr = str.length();
        assertEquals(Task_3_13.getNewStr(str, -1, maxSizeStr), str);
        assertEquals(Task_3_13.getNewStr(str, 2, maxSizeStr), str.substring(2));
        assertEquals(Task_3_13.getNewStr(str, 2, 33), str.substring(2));
        assertEquals(Task_3_13.getNewStr(str, -2, 14), str.substring(0, 14));
        assertEquals(Task_3_13.getNewStr(str, 2, 14), str.substring(2, 14));
        assertEquals(Task_3_13.getNewStr(str, 2, 2), "");
    }
}
