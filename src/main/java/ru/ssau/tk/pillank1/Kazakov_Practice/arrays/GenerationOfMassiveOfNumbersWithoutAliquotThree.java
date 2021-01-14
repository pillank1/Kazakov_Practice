package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class GenerationOfMassiveOfNumbersWithoutAliquotThree {
    static double[] setSize(int size) {
        double[] massive = new double[size];
        int j = 1;

        for (int i = 0; i < massive.length; i++) {
            if (j % 3 == 0) {
                j++;
            }

            massive[i] = j;

            j++;
        }

        return massive;
    }
}
