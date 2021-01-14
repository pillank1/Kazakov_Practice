package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class SearchingMostMeetingNumber {
    public static double mostMeetingNumber(double[] massive) {
        double y = 0;
        double value = 0;

        for (int i = 0; i < massive.length - 1; i++) {
            double x = 1;

            for (int j = i + 1; j < massive.length; j++) {
                if (massive[i] == massive[j]) {
                    x++;
                }
            }

            if (y < x) {
                y = x;
                value = massive[i];
            }
        }

        return value;
    }
}
