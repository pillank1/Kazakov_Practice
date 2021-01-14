package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CreateMassiveByIndexTest {
    CreateMassiveByIndex massif01 = new CreateMassiveByIndex();

    int[] massive2 = new int[7];
    int[] massive3 = new int[9];
    int[] massive4 = new int[3];

    @Test
    public void testMassif() {
        assertEquals(massif01.massiveSize(7), massive2);
        assertEquals(massif01.massiveSize(3), massive4);
        assertEquals(massif01.massiveSize(9), massive3);
    }
}
