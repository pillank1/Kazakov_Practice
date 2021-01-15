package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import java.util.Arrays;

public class CheckMassiveOnNaNAndSorting {
    public static void sort(Double[] massive) {
        int k = 0;

        for (int i = 0; i < massive.length; i++) {
            if (Double.isNaN(massive[i])) {
                k++;
            }
        }

        if (k == 0) {
            java.util.Arrays.sort(massive);
        }
    }
}

