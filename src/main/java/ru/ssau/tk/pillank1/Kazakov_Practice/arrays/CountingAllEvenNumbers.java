package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class CountingAllEvenNumbers {
    static int countingAmount(double[] massive) {
        int count = 0;

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
