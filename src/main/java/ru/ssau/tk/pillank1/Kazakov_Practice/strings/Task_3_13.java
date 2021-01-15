package ru.ssau.tk.pillank1.Kazakov_Practice.strings;

public class Task_3_13 {
    static String getNewStr(String str, int from, int to) {
        if (from < 0) {
            from = 0;
        }

        if (to > str.length()) {
            to = str.length();
        }

        if (from == to) {
            return "";
        }

        return str.substring(from, to);
    }
}
