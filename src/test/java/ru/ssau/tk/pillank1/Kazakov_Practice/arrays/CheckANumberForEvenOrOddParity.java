package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class CheckANumberForEvenOrOddParity {
    public static boolean[] checkNumbers(int[] massive) {
        boolean[] booleans = new boolean[massive.length];

        for (int i = 0; i < massive.length; i++) {
            booleans[i] = massive[i] % 2 == 0;
        }

        return booleans;
    }
}
