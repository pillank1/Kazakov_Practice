package ru.ssau.tk.pillank1.Kazakov_Practice.DataTypes.point;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntGeneratorImplTest {
    IntGenerator generator = new IntGeneratorImpl();

    @Test
    public void testNextInt() {
        assertEquals(generator.nextInt(), 0);
        assertEquals(generator.nextInt(), 1);
        assertEquals(generator.nextInt(), 2);
    }
}
