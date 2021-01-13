package ru.ssau.tk.pillank1.Kazakov_Practice.dataTypes;

import org.testng.annotations.Test;
import ru.ssau.tk.pillank1.Kazakov_Practice.dataTypes.person.Person;
import ru.ssau.tk.pillank1.Kazakov_Practice.dataTypes.point.Point;

public class ConsoleOutputOfTypesTest {
    @Test
    public void testPrintType() {
        ConsoleOutputOfTypes.printType((byte) 255);
        ConsoleOutputOfTypes.printType('z');
        ConsoleOutputOfTypes.printType((short) 65535);
        ConsoleOutputOfTypes.printType(125);
        ConsoleOutputOfTypes.printType(125L);
        ConsoleOutputOfTypes.printType(0.1f);
        ConsoleOutputOfTypes.printType(0.1d);
        ConsoleOutputOfTypes.printType(false);
        ConsoleOutputOfTypes.printType(new Person());
        Point point = new Point(1,2,3);
        ConsoleOutputOfTypes.printType(point);
        ConsoleOutputOfTypes.printType(null);
    }
    /*Вывод в консоль:
    byte
    char
    short
    int
    long
    float
    double
    boolean
    Person
    Point
    null
    */
}
