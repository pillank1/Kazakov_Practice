package ru.ssau.tk.pillank1.Kazakov_Practice.strings;

public class Task_3_2 {
    public static void convertToBytes(String str) {
        byte[] bytes = str.getBytes();

        for (byte byt : bytes) {
            System.out.println(byt);
        }
    }
}
