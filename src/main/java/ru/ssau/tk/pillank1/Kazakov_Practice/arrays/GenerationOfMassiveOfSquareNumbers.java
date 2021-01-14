package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class GenerationOfMassiveOfSquareNumbers {
    public static int[] setSize(int size) {
        int[] massive = new int[size];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) Math.pow(i, 2);
        }
        return massive;
    }
}
