package ru.ssau.tk.pillank1.Kazakov_Practice.DataTypes.operations;

public abstract class Operation {
    public abstract double apply(double number);

    public double applyTriple(double number) {
        return apply(apply(apply(number)));
    }
}
