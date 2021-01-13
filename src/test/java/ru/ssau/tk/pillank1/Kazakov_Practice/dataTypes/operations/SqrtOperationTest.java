package ru.ssau.tk.pillank1.Kazakov_Practice.dataTypes.operations;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SqrtOperationTest {
    private final double DELTA = 1E-12;
    SqrtOperation radical = new SqrtOperation();

    @Test
    public void testApply() {
        assertEquals(radical.apply(121), 11, DELTA);
        assertEquals(radical.apply(0), 0, DELTA);
        assertEquals(radical.apply(7), Math.sqrt(7), DELTA);
        assertEquals(radical.apply(-1), Double.NaN, DELTA);
        assertEquals(radical.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(radical.apply(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(radical.apply(Double.NaN), Double.NaN, DELTA);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(radical.applyTriple(6561), 3, DELTA);
        assertEquals(radical.applyTriple(0), 0, DELTA);
        assertEquals(radical.applyTriple(7), Math.sqrt(Math.sqrt(Math.sqrt(7))), DELTA);
        assertEquals(radical.applyTriple(-1), Double.NaN, DELTA);
        assertEquals(radical.applyTriple(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(radical.applyTriple(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(radical.applyTriple(Double.NaN), Double.NaN, DELTA);
    }
}