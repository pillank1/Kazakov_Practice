package ru.ssau.tk.pillank1.Kazakov_Practice.exceptions;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.pillank1.Kazakov_Practice.dataTypes.person.Person;
import java.io.*;

public class SerializePersonTest {

    @Test
    public void testSet() {
        Object object = new Object();
        Person person = new Person();
        String fileName = "";

        Assert.assertThrows(FileNotFoundException.class, () -> SerializePerson.set(new ObjectOutputStream(new FileOutputStream(fileName)), object));
        Assert.assertThrows(ClassCastException.class, () -> SerializePerson.set(new ByteArrayOutputStream(), person));
    }
}