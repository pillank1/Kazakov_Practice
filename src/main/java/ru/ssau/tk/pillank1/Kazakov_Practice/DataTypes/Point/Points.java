package ru.ssau.tk.pillank1.Kazakov_Practice.DataTypes.Point;

public class Points {
    private Points() {

    }

    public static Point sum(Point firstObj, Point secondObj) {
        return new Point(firstObj.x + secondObj.x, firstObj.y + secondObj.y, firstObj.z + secondObj.z);
    }

    public static Point subtract(Point firstObj, Point secondObj) {
        return new Point(firstObj.x - secondObj.x, firstObj.y - secondObj.y, firstObj.z - secondObj.z);
    }

    public static Point multiply(Point firstObj, Point secondObj) {
        return new Point(firstObj.x * secondObj.x, firstObj.y * secondObj.y, firstObj.z * secondObj.z);
    }

    public static Point divide(Point firstObj, Point secondObj) {
        return new Point(firstObj.x / secondObj.x, firstObj.y / secondObj.y, firstObj.z / secondObj.z);
    }

    public static Point enlarge(Point obj, double multiplier) {
        return new Point(obj.x * multiplier, obj.y * multiplier, obj.z * multiplier);
    }

    public static double length(Point point) {
        return point.length();
    }

    public static Point opposite(Point obj) {
        return new Point(-obj.x, -obj.y, -obj.z);
    }

    public static Point inverse(Point obj) {
        return new Point(1/obj.x, 1/obj.y, 1/obj.z);
    }
}
