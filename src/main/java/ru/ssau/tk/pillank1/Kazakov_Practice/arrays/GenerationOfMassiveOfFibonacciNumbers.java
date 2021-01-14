package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class GenerationOfMassiveOfFibonacciNumbers {
    public static int[] setSize(int size) {
        int[] massive = new int[size];

        massive[0] = 0;
        massive[1] = 1;

        for (int i = 2; i < massive.length; i++) {
            massive[i] = massive[i - 1] + massive[i - 2];
        }

        return massive;
    }
}
