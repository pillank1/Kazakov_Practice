package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class CreateNegativeMassive {
    static void negateMassive(int[] massive) {
        for (int i = 0; i < massive.length; i++) {
            massive[i] = ~massive[i];
        }
    }
}
