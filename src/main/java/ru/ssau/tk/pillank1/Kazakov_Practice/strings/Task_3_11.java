package ru.ssau.tk.pillank1.Kazakov_Practice.strings;

public class Task_3_11 {
    static int getAmount(String[] massive, String prefix, String postfix) {
        int a = 0;

        for (int i = 0; i < massive.length; i++) {
            massive[i] = massive[i].trim();
        }

        for (String str : massive) {
            if (str.startsWith(prefix) && str.endsWith(postfix)) {
                a++;
            }
        }

        return a;
    }
}
