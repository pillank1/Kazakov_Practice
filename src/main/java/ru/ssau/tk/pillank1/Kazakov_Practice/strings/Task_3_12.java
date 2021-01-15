package ru.ssau.tk.pillank1.Kazakov_Practice.strings;

public class Task_3_12 {
    static String getStr(String str1, String str2, String str3) {
        for (int i = 0; i < 100 && str1.contains(str2); i++) {
            str1 = str1.replaceAll(str2, str3);
        }

        return str1;
    }
}
