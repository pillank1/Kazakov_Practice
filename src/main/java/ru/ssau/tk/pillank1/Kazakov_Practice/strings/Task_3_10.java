package ru.ssau.tk.pillank1.Kazakov_Practice.strings;

public class Task_3_10 {
    static int getAmount(String[] massive, String prefix, String postfix) {
        int a = 0;

        for (String string : massive) {
            if (string.startsWith(prefix) && string.endsWith(postfix)) {
                a++;
            }
        }

        return a;
    }
}
