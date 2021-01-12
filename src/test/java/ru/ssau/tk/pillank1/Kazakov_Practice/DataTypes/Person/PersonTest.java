package ru.ssau.tk.pillank1.Kazakov_Practice.DataTypes.Person;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {

    @Test
    public void testMethod() {
        Person man = new Person();
        Person woman = new Person();
        man.setFirstName("Egor");
        woman.setFirstName("Anastasia");

        man.setLastName("Aushev");
        woman.setLastName("Ausheva");

        man.setPassportId(646551);
        woman.setPassportId(155646);

        assertEquals(man.getFirstName(), "Egor");
        assertEquals(woman.getFirstName(), "Anastasia");

        assertEquals(man.getLastName(), "Aushev");
        assertEquals(woman.getLastName(), "Ausheva");

        assertEquals(man.getPassportId(), 646551);
        assertEquals(woman.getPassportId(), 155646);
    }
}
