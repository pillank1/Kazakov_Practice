package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class CheckingForAvailabilityOfNumberInMassive {
    static boolean check(double[] arr, double number) {
        for (double i : arr) {
            if (i == number) {
                return true;
            }
        }

        return false;
    }
}
