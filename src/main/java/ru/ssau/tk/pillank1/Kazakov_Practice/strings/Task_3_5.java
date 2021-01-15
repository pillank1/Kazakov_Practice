package ru.ssau.tk.pillank1.Kazakov_Practice.strings;

import java.util.Objects;

public class Task_3_5 {
    static boolean compareStr(String str1, String str2) {
        return !Objects.equals(null, str1) && !Objects.equals(null, str2) && !str1.equals(str2) && str1.equalsIgnoreCase(str2);
    }
}
