package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class SearchingMaximalNumberInMassive {
    public static Integer maxNumberMassif(int[] massive) {
        if (massive.length == 0) {
            return null;
        } else {
            int max = massive[0];

            for (int i = 1; i < massive.length; i++) {
                if (max < massive[i]) {
                    max = massive[i];
                }
            }

            return max;
        }
    }
}
