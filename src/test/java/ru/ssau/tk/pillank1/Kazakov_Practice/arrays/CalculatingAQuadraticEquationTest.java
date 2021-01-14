package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatingAQuadraticEquationTest {

    @Test
    public void testResults() {
        CalculatingAQuadraticEquation equation = new CalculatingAQuadraticEquation();

        assertEquals(equation.getRadicals(1, -2, 1), new double[]{1});
        assertEquals(equation.getRadicals(5, 20, 20), new double[]{-2});
        assertEquals(equation.getRadicals(2, 4, 0), new double[]{-2, 0});
        assertEquals(equation.getRadicals(4, 0, -4), new double[]{-1, 1});
        assertEquals(equation.getRadicals(0, -8, 4), new double[]{0.5});
    }
}
