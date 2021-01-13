package ru.ssau.tk.pillank1.Kazakov_Practice.dataTypes.point;

public class ResettableIntGenerator implements Resettable, IntGenerator {
    private int count = 0;
    String name = "Absent";

    @Override
    public int nextInt() {
        return count++;
    }

    @Override
    public void reset() {
        count = 0;
    }

    public String getName() {
        return name;
    }
}
