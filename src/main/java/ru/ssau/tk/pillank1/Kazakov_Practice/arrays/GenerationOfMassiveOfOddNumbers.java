package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class GenerationOfMassiveOfOddNumbers {
    public static int[] setSize(int size) {
        int[] massive = new int[size];

        int count = 1;

        for (int i = 0; i < massive.length; i++) {
            massive[i] = count;
            count = count + 2;
        }

        return massive;
    }
}
