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

    Person noName = new Person();
    Person womanNoPassport = new Person("Anastasia", "Ausheva");
    Person passportOfNoName = new Person(null, null, 564684);
    Person korbanDallas = new Person(578155);

    @Test
    public void testFirstNameMethods() {
        noName.setFirstName("Egor");
        womanNoPassport.setFirstName(null);
        passportOfNoName.setFirstName("Pavel");
        assertEquals(noName.getFirstName(), "Egor");
        assertNull(womanNoPassport.getFirstName());
        assertEquals(passportOfNoName.getFirstName(), "Pavel");
        assertNull(korbanDallas.getFirstName());
    }

    @Test
    public void testLastNameMethods() {
        passportOfNoName.setLastName("Aleksandrov");
        korbanDallas.setLastName(null);
        assertNull(noName.getLastName());
        assertEquals(womanNoPassport.getLastName(), "Ausheva");
        assertEquals(passportOfNoName.getLastName(), "Aleksandrov");
        assertNull(korbanDallas.getLastName());
    }

    @Test
    public void testPassportIDMethods() {
        womanNoPassport.setPassportId(945186);
        korbanDallas.setPassportId(988774);
        assertEquals(noName.getPassportId(), 0);
        assertEquals(womanNoPassport.getPassportId(), 945186);
        assertEquals(passportOfNoName.getPassportId(), 564684);
        assertEquals(korbanDallas.getPassportId(), 988774);
    }
}
