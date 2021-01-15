package ru.ssau.tk.pillank1.Kazakov_Practice.strings;

public class Task_3_3 {
    public static void main (String[] args) {
        String str1 = "Hello";
        String str2 = new String(str1);
        String str3 = "Hello";

        if (str1 == str2) {
            System.out.println("str1 == str2");
        }

        if (str1 == str3) {
            System.out.println("str1 == str3");
        }

        if (str1.equals(str2)) {
            System.out.println("str1.equals(str2)");
        }

        if (str1.equals(str3)) {
            System.out.println("str1.equals(str3)");
        }
        /* Вывод в консоль:
str1 == str3
str1.equals(str2)
str1.equals(str3)
*/
    }
}
