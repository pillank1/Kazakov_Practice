package ru.ssau.tk.pillank1.Kazakov_Practice.dataTypes.point;

public class CreatingPoints_1_8 {
    public static void main(String[] args) {
        Point firstPoint = new Point(15, 8, 22);
        Point secondPoint = new Point(3, 4, 11);
        System.out.println("Vector product: (" + Points.vectorProduct(firstPoint, secondPoint).x + ", " + Points.vectorProduct(firstPoint, secondPoint).y + ", " + Points.vectorProduct(firstPoint, secondPoint).z + ')');
        System.out.println("Scalar product: " + Points.scalarProduct(firstPoint, secondPoint));
    }
}
