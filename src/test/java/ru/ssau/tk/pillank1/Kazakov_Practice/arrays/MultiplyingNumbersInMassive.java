package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class MultiplyingNumbersInMassive {
    static double multiplyNumbers(double[] massive) {
        double multiply = 1;

        for (Double i : massive) {
            if (i != 0 & !i.isInfinite() & !i.isNaN()) {
                multiply *= i;
            }
        }

        return multiply;
    }
}
