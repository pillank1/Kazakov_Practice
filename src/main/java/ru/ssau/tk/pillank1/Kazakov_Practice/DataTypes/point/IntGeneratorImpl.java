package ru.ssau.tk.pillank1.Kazakov_Practice.DataTypes.point;

public class IntGeneratorImpl implements IntGenerator {
    private int count = 0;

    @Override
    public int nextInt() {
        return count++;
    }
}
