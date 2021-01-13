package ru.ssau.tk.pillank1.Kazakov_Practice.DataTypes.point;

public class CreatingPoints_1_5 {
    public static void main(String[] args) {
        Point firstPoint = new Point(15, 8, 22);
        Point secondPoint = new Point(3, 4, 11);
        System.out.println("Multiplication firstPoint by number=4: (" + Points.enlarge(firstPoint, 4).x + ", " + Points.enlarge(firstPoint, 4).y + ", " + Points.enlarge(firstPoint, 4).z + ')');
        System.out.println("Multiplication secondPoint by number=2.5: (" + Points.enlarge(secondPoint, 2.5).x + ", " + Points.enlarge(secondPoint, 2.5).y + ", " + Points.enlarge(secondPoint, 2.5).z + ')');
    }
}
