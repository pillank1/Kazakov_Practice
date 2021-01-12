package ru.ssau.tk.pillank1.Kazakov_Practice.DataTypes.Point;

public class CreatingPoints_1_3 {
    public static void main(String[] args) {
        Point points1 = new Point(0, 0, 0);
        Point points2 = new Point(-1, 2, -3);
        Point points3 = new Point(5.5, 7.99, -100.104);
        System.out.println("Points1: (" + points1.x + ", " + points1.y + ", " + points1.z + ')');
        System.out.println("Points2: (" + points2.x + ", " + points2.y + ", " + points2.z + ')');
        System.out.println("Points3: (" + points3.x + ", " + points3.y + ", " + points3.z + ')');
    }
}
