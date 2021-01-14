package ru.ssau.tk.pillank1.Kazakov_Practice.exceptions;

public class StringWithCharFromString {
    public static char getCharFromString(String[] arrayStr, int n, int m) {
        if (n > arrayStr.length) {
            throw new StringIndexOutOfBoundsException();
        }

        if (m > arrayStr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return arrayStr[n].charAt(m);
    }
}
