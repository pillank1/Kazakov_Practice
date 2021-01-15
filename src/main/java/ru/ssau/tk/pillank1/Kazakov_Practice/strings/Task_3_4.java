package ru.ssau.tk.pillank1.Kazakov_Practice.strings;

public class Task_3_4 {
    public static boolean palindrome(String string) {
        StringBuilder reverseString = new StringBuilder();

        for (int i = string.length() - 1; i >= 0; i--) {
            reverseString.append(string.charAt(i));
        }

        return string.equals(reverseString.toString());
    }
}
