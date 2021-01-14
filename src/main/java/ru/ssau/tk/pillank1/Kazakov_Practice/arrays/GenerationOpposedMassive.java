package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class GenerationOpposedMassive {
    static void setOpposedMassive(double[] massive) {
        for (int i = 0; i < massive.length; i++) {
            massive[i] = -massive[i];
        }
    }
}
