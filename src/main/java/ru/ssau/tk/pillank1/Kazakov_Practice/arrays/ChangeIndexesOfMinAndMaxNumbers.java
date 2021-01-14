package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class ChangeIndexesOfMinAndMaxNumbers {
    static void changeIndexes(double[] massive) {
        double min = massive[0];
        double max = massive[0];

        for (int i = 0; i < massive.length; i++) {
            min = Math.min(massive[i], min);
            max = Math.max(massive[i], max);
        }

        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == min) {
                indexMin = i;
            }

            if (massive[i] == max) {
                indexMax = i;
            }
        }

        massive[indexMin] = max;
        massive[indexMax] = min;
    }
}
