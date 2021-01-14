package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class GenerationOfMassive {
    public int[] setSize(int size) {
        int[] massive = new int[size];

        massive[0] = 2;
        massive[size - 1] = 2;

        for (int i = 1; i < massive.length - 1; i++) {
            massive[i] = 1;
        }

        return massive;
    }
}
