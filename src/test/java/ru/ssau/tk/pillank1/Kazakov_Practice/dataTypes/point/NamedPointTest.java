package ru.ssau.tk.pillank1.Kazakov_Practice.dataTypes.point;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {
    NamedPoint unnamedPoint = new NamedPoint(8, 4, 6);
    NamedPoint namedPoint = new NamedPoint(7, -2, 1, "Second");
    NamedPoint emptyPoint = new NamedPoint();

    @Test
    public void testGetName() {
        assertNull(unnamedPoint.getName());
        assertEquals(namedPoint.getName(), "Second");
        assertEquals(emptyPoint.getName(), "Origin");
    }

    @Test
    public void testSetName() {
        unnamedPoint.setName("Fourth");
        namedPoint.setName("Fifth");
        emptyPoint.setName("Sixth");
        assertEquals(unnamedPoint.getName(), "Fourth");
        assertEquals(namedPoint.getName(), "Fifth");
        assertEquals(emptyPoint.getName(), "Sixth");
    }

    @Test
    public void testReset() {
        emptyPoint.reset();
        assertEquals(emptyPoint.getName(), "Absent");
    }
}
