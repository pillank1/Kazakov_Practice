package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class CountingAllNumbersOnEvenIndexesInMassive {
    public static int countingAmount(int[] massive) {
        int amount = 0;

        for (int i = 1; i < massive.length; i = i + 2) {
            amount = massive[i] + amount;
        }

        return amount;
    }
}
