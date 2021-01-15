package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class CreateNewNegativeMassive {
    static int[] negateNewMassive(int[] massive) {
        int[] newMassive = new int[massive.length];

        System.arraycopy(massive, 0, newMassive, 0, newMassive.length);

        for (int i = 0; i < newMassive.length; i++) {
            newMassive[i] = ~newMassive[i];
        }

        return newMassive;
    }
}
