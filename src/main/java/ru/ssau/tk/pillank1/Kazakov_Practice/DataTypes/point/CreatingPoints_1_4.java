package ru.ssau.tk.pillank1.Kazakov_Practice.DataTypes.point;

public class CreatingPoints_1_4 {
    public static void main(String[] args) {
        Point firstPoint = new Point(15, 8, 22);
        Point secondPoint = new Point(3, 4, 11);
        System.out.println("First point: (" + firstPoint.x + ", " + firstPoint.y + ", " + firstPoint.z + ')');
        System.out.println("Second point: (" + secondPoint.x + ", " + secondPoint.y + ", " + secondPoint.z + ')');
        System.out.println("Sum: (" + Points.sum(firstPoint, secondPoint).x + ", " + Points.sum(firstPoint, secondPoint).y + ", " + Points.sum(firstPoint, secondPoint).z + ')');
        System.out.println("Subtract: (" + Points.subtract(firstPoint, secondPoint).x + ", " + Points.subtract(firstPoint, secondPoint).y + ", " + Points.subtract(firstPoint, secondPoint).z + ')');
        System.out.println("Multiply: (" + Points.multiply(firstPoint, secondPoint).x + ", " + Points.multiply(firstPoint, secondPoint).y + ", " + Points.multiply(firstPoint, secondPoint).z + ')');
        System.out.println("Divide: (" + Points.divide(firstPoint, secondPoint).x + ", " + Points.divide(firstPoint, secondPoint).y + ", " + Points.divide(firstPoint, secondPoint).z + ')');
    }
}
