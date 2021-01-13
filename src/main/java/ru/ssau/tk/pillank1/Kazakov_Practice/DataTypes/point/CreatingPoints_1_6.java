package ru.ssau.tk.pillank1.Kazakov_Practice.DataTypes.point;

public class CreatingPoints_1_6 {
    public static void main(String[] args) {
        Point firstPoint = new Point(15, 8, 22);
        Point secondPoint = new Point(3, 4, 11);
        System.out.println("Length of radius vector of ferstPoint: " + Points.length(firstPoint));
        System.out.println("Length of radius vector of secondPoint: " + Points.length(secondPoint));
    }
}
