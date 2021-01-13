package ru.ssau.tk.pillank1.Kazakov_Practice.DataTypes.point;

public class CreatingPoints_1_7 {
    public static void main(String[] args) {
        Point firstPoint = new Point(15, 8, 22);
        Point secondPoint = new Point(3, 4, 11);
        System.out.println("Opposed firstPoint: (" + Points.opposite(firstPoint).x + ", " + Points.opposite(firstPoint).y + ", " + Points.opposite(firstPoint).z + ')');
        System.out.println("Inverted secondPoint: (" + Points.inverse(secondPoint).x + ", " + Points.inverse(secondPoint).y + ", " + Points.inverse(secondPoint).z + ')');
    }
}
