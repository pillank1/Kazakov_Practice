package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

public class ConvertationLongToIntAndIntToLong {
    static int[] convertLongToInt(long number) {
        return new int[]{(int) (number >>> 32), (int) (number)};
    }

    static long convertIntToLong(int[] number) {
        return ((long) number[0] << 32) | ((long) number[1] & 4294967295L);
    }
}
