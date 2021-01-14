package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class CalculatingAQuadraticEquation {
    double[] radicals;

    public double[] getRadicals(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("Error");
        } else if (d == 0) {
            double x = (-b) / (2 * a);

            radicals = new double[]{x};
        } else {
            if (a == 0) {
                double x = (-c) / b;

                radicals = new double[]{x};
            } else {
                double x1 = ((-b + Math.sqrt(d)) / (2 * a)) + ((-b + Math.sqrt(d)) % (2 * a));
                double x2 = (-b - Math.sqrt(d)) / (2 * a) + ((-b - Math.sqrt(d)) % (2 * a));

                if (x1 > x2) {
                    radicals = new double[]{x2, x1};
                } else {
                    radicals = new double[]{x1, x2};
                }
            }
        }

        return radicals;
    }
}
