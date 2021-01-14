package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class MassiveOfDividersOfNumber {
    static double[] getDividersOfNumbers(int number) {
        int count = 0;

        for (int i = 1; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
            }
        }

        double[] massive = new double[count * 2 + (Math.sqrt(number) == (int) Math.sqrt(number) ? 1 : 0)];

        int j = 0;

        for (int i = 0; i < (int) Math.sqrt(number) ; i++) {
            if (number % (i + 1) == 0) {
                massive[j] = (i + 1);
                massive[massive.length - j - 1] = number / (i + 1);
                j++;
            }
        }

        return massive;
    }
}
