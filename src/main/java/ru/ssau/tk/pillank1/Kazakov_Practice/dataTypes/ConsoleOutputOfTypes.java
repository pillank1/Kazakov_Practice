package ru.ssau.tk.pillank1.Kazakov_Practice.dataTypes;

public class ConsoleOutputOfTypes {
    public static void printType(byte type) {
        System.out.println("byte");
    }

    public static void printType(char type) {
        System.out.println("char");
    }

    public static void printType(short type) {
        System.out.println("short");
    }

    public static void printType(int type) {
        System.out.println("int");
    }

    public static void printType(long type) {
        System.out.println("long");
    }

    public static void printType(float type) {
        System.out.println("float");
    }

    public static void printType(double type) {
        System.out.println("double");
    }

    public static void printType(boolean type) {
        System.out.println("boolean");
    }

    public static void printType(Object type) {
        if (type == null) {
            System.out.println("null");
        } else {
            System.out.println(type.getClass().getSimpleName());
        }
    }
}
