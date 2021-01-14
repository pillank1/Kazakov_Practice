package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class FirstOrLastNumber {
    public static boolean firstOrLast(double[] massive) {
        double first = 0;
        double last = 0;

        int i;

        for (i = 0; i < massive.length; i++) {
            if (massive[i] % massive[0] == 0) {
                first++;
            }

            if (massive[i] % massive[massive.length-1] == 0) {
                last++;
            }
        }

        return first > last;
    }
}
