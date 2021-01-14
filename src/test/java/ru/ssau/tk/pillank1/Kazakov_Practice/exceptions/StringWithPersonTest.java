package ru.ssau.tk.pillank1.Kazakov_Practice.exceptions;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.pillank1.Kazakov_Practice.dataTypes.person.Person;

import static org.testng.Assert.*;

public class StringWithPersonTest {

    @Test
    public void testGetNamesOfPerson() {
        Person person1 = new Person("Sergey", "Shnurov");
        assertEquals(StringWithPerson.getNamesOfPerson(person1), "Sergey Shnurov");
        Person person2 = new Person(null, null);
        Assert.assertThrows(NullPointerException.class, () -> {
            assertNull(person2);
        });
    }
}