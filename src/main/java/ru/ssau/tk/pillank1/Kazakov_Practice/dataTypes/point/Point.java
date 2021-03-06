package ru.ssau.tk.pillank1.Kazakov_Practice.dataTypes.point;

public class Point {
    public final double x, y, z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public String toString() {
        return "[" + x + ", " + y + ", " + z + "]";
    }
}
