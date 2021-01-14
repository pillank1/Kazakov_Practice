package ru.ssau.tk.pillank1.Kazakov_Practice.exceptions;

public class CreateNumberByTwoStrings {
    public static int getIntByTwoStrings(String str1, String str2) {
        if (Integer.parseInt(str2) == 0) {
            throw new ArithmeticException();
        }

        if (!Character.isDigit(str1.charAt(0)) || !Character.isDigit(str2.charAt(0))) {
            throw new NumberFormatException();
        }

        return Integer.parseInt(str1) / Integer.parseInt(str2);
    }
}
