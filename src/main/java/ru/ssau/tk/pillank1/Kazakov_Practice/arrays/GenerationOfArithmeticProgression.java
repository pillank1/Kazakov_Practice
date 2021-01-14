package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class GenerationOfArithmeticProgression {
    public int[] arithmeticMassive(int size, int first, int step) {
        int[] massive = new int[size];

        massive[0] = first;

        for (int i = 1; i < size; i++) {
            massive[i] = massive[i - 1] + step;
        }

        return massive;
    }
}
