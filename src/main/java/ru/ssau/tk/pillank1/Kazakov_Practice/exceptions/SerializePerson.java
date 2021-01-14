package ru.ssau.tk.pillank1.Kazakov_Practice.exceptions;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SerializePerson {
    public static void set(OutputStream out, Object object) throws IOException {
        ((ObjectOutputStream) out).writeObject(object);
    }
}
