package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class CheckingForAvailabilityOfNullInMassive {
    public static boolean check(Integer[] massive) {
        boolean result = false;

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == null) {
                result = true;
                break;
            }
        }

        return result;
    }
}
