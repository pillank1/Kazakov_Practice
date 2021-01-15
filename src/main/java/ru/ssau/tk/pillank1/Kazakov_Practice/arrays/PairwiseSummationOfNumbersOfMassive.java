package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class PairwiseSummationOfNumbersOfMassive {
    static int[] summarizePairwise(int[] massive) {
        int[] newMassive = new int[massive.length / 2 + (massive.length % 2 == 0 ? 0 : 1)];

        for (int i = 0; i < newMassive.length; i++) {
            newMassive[i] = massive[2 * i] + (2 * i + 1 < massive.length ? massive[2 * i + 1] : 0);
        }

        return newMassive;
    }
}
