package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class GenerationSymmetricMassive {
    public static int[] getNumber(int num) {
        if (num == 0) {
            return null;
        }

        int[] massive = new int[num];

        for (int i = 0; i < Math.ceil((double) num / 2); i++) {
            massive[i] = i + 1;
            massive[num - i - 1] = i + 1;
        }

        return massive;
    }
}
