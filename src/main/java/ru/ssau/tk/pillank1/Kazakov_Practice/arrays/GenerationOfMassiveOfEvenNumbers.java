package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class GenerationOfMassiveOfEvenNumbers {
    public static int[] setSize(int size) {
        int[] arr = new int[size];

        int count = size * 2;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = count;

            count = count - 2;
        }
        return arr;
    }
}
