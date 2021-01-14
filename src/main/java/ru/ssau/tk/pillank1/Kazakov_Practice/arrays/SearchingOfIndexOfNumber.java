package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class SearchingOfIndexOfNumber {
    public static double indexOfNumber(double[] massive, double number) {
        double i;

        for (i = 0; i < massive.length; i++) {
            if (massive[(int) i] == number) {
                break;
            }
        }

        return i;
    }
}
