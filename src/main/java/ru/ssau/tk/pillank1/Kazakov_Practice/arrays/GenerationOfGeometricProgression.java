package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class GenerationOfGeometricProgression {
    static double[] geometricMassive(int size, int first, int step) {
        double[] massive = new double[size];

        massive[0] = first;

        for (int i = 1; i < size; i++) {
            massive[i] = massive[i - 1] * step;
        }

        return massive;
    }
}
