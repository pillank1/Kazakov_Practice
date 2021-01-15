package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class CreateTwoDimensionalNaturalMassive {
    static int[][] createNaturalMassive(int size) {
        int[][] massive = new int[size][];

        int k = 1;

        for (int i = 0; i < size; i++) {
            massive[i] = new int[size - i];
            for (int j = 0; j < size - i; j++) {
                massive[i][j] = k;
                k++;
            }
        }

        return massive;
    }
}
