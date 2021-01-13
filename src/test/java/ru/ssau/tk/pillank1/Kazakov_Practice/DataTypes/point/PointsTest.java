package ru.ssau.tk.pillank1.Kazakov_Practice.DataTypes.point;

import org.testng.annotations.Test;

import static java.lang.Double.*;
import static org.testng.Assert.*;

public class PointsTest {
    private final double DELTA = 1E-12;

    private boolean equalsApproximately(double coordinateOfFirst, double coordinateOfSecond) {
        return ((isNaN(coordinateOfFirst) && isNaN(coordinateOfSecond)) || (isInfinite(coordinateOfFirst) && isInfinite(coordinateOfSecond)) || Math.abs(coordinateOfFirst - coordinateOfSecond) < DELTA);
    }

    private boolean equalsApproximately(Point firstPoint, Point secondPoint) {
        return equalsApproximately(firstPoint.x, secondPoint.x) && equalsApproximately(firstPoint.y, secondPoint.y) && equalsApproximately(firstPoint.z, secondPoint.z);
    }

    Point firstPoint = new Point(-15, 8, 22);
    Point secondPoint = new Point(0., -2, 11);

    @Test
    public void testSum() {
        assertTrue(equalsApproximately(Points.sum(firstPoint, secondPoint), new Point(-15,6,33)));
    }

    @Test
    public void testSubtract() {
        assertTrue(equalsApproximately(Points.subtract(firstPoint, secondPoint), new Point(-15,10,11)));
    }

    @Test
    public void testMultiply() {
        assertTrue(equalsApproximately(Points.multiply(firstPoint, secondPoint), new Point(0,-16,242)));
    }

    @Test
    public void testDivide() {
        assertTrue(equalsApproximately(Points.divide(firstPoint, secondPoint), new Point(NEGATIVE_INFINITY,-4,2)));
    }

    @Test
    public void testEnlarge() {
        assertTrue(equalsApproximately(Points.enlarge(firstPoint, 8), new Point(-120,64,176)));
    }

    @Test
    public void testOpposite() {
        assertTrue(equalsApproximately(Points.opposite(firstPoint), new Point(15,-8,-22)));
        assertTrue(equalsApproximately(Points.opposite(secondPoint), new Point(-0.,2,-11)));
    }

    @Test
    public void testInverse() {
        assertTrue(equalsApproximately(Points.inverse(firstPoint), new Point(-0.06666666666667,0.125,0.0454545454545)));
        assertTrue(equalsApproximately(Points.inverse(secondPoint), new Point(NEGATIVE_INFINITY,-0.5,0.0909090909090)));
    }

    @Test
    public void testVectorProduct() {
        assertTrue(equalsApproximately(Points.vectorProduct(firstPoint, secondPoint), new Point(132,165,30)));
    }

    @Test
    public void testLength() {
        assertEquals(Points.length(firstPoint), Math.sqrt(773), DELTA);
        assertEquals(Points.length(secondPoint), Math.sqrt(125), DELTA);
    }

    @Test
    public void testScalarProduct() {
        assertEquals(Points.scalarProduct(firstPoint, secondPoint), 226, DELTA);
    }
}