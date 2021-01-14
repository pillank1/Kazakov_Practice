package ru.ssau.tk.pillank1.Kazakov_Practice.exceptions;

import ru.ssau.tk.pillank1.Kazakov_Practice.dataTypes.person.Person;

public class StringWithPerson {
    public static String getNamesOfPerson(Person obj) {
        if (obj.getFirstName() == null || obj.getLastName() == null) {
            throw new NullPointerException();
        }
        return obj.toString();
    }
}
