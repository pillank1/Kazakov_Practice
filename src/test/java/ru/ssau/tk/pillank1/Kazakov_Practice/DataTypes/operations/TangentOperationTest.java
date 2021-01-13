package ru.ssau.tk.pillank1.Kazakov_Practice.DataTypes.operations;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TangentOperationTest {
    private final double DELTA = 1E-12;
    TangentOperation tangent = new TangentOperation();

    @Test
    public void testApply() {
        assertEquals(tangent.apply((Math.PI)/6), (1 / Math.sqrt(3)), DELTA);
        assertEquals(tangent.apply(0), 0, DELTA);
        assertEquals(tangent.apply(7), Math.tan(7), DELTA);
        assertEquals(tangent.apply(-3), Math.tan(-3), DELTA);
        assertEquals(tangent.apply(Double.POSITIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(tangent.apply(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(tangent.apply(Double.NaN), Double.NaN, DELTA);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(tangent.applyTriple((Math.PI)/3), Math.tan(Math.tan(Math.sqrt(3))), DELTA);
        assertEquals(tangent.applyTriple(0), 0, DELTA);
        assertEquals(tangent.applyTriple(10), Math.tan(Math.tan(Math.tan(10))), DELTA);
        assertEquals(tangent.applyTriple(-19), Math.tan(Math.tan(Math.tan(-19))), DELTA);
        assertEquals(tangent.applyTriple(Double.POSITIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(tangent.applyTriple(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(tangent.applyTriple(Double.NaN), Double.NaN, DELTA);
    }
}