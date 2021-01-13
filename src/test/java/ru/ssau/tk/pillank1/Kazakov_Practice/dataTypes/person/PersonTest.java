package ru.ssau.tk.pillank1.Kazakov_Practice.dataTypes.person;

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

    public Person noName = new Person();
    public Person womanNoPassport = new Person("Anastasia", "Ausheva");
    public Person passportOfNoName = new Person(null, null, 564684);
    public Person korbanDallas = new Person(578155);
    public Person woman = new Person("Anastasia", "Ausheva", 941675, Gender.FEMALE);
    public Person man = new Person(Gender.MALE);

    @Test
    public void testFirstNameMethods() {
        noName.setFirstName("Egor");
        womanNoPassport.setFirstName(null);
        passportOfNoName.setFirstName("Pavel");
        man.setFirstName("Vladimir");
        assertEquals(noName.getFirstName(), "Egor");
        assertNull(womanNoPassport.getFirstName());
        assertEquals(passportOfNoName.getFirstName(), "Pavel");
        assertNull(korbanDallas.getFirstName());
        assertEquals(woman.getFirstName(), "Anastasia");
        assertEquals(man.getFirstName(), "Vladimir");
    }

    @Test
    public void testLastNameMethods() {
        passportOfNoName.setLastName("Aleksandrov");
        korbanDallas.setLastName(null);
        woman.setLastName("Bulgakova");
        assertNull(noName.getLastName());
        assertEquals(womanNoPassport.getLastName(), "Ausheva");
        assertEquals(passportOfNoName.getLastName(), "Aleksandrov");
        assertNull(korbanDallas.getLastName());
        assertEquals(woman.getLastName(), "Bulgakova");
        assertNull(man.getLastName());
    }

    @Test
    public void testPassportIDMethods() {
        womanNoPassport.setPassportId(945186);
        korbanDallas.setPassportId(988774);
        assertEquals(noName.getPassportId(), 0);
        assertEquals(womanNoPassport.getPassportId(), 945186);
        assertEquals(passportOfNoName.getPassportId(), 564684);
        assertEquals(korbanDallas.getPassportId(), 988774);
        assertEquals(man.getPassportId(), 0);
    }

    @Test
    public void testGenderMethods() {
        noName.setGender(Gender.FEMALE);
        womanNoPassport.setGender(Gender.FEMALE);
        passportOfNoName.setGender(Gender.MALE);
        assertEquals(noName.getGender(), Gender.FEMALE);
        assertEquals(womanNoPassport.getGender(), Gender.FEMALE);
        assertNotNull(passportOfNoName.getGender());
        assertNull(korbanDallas.getGender());
        assertEquals(woman.getGender(), Gender.FEMALE);
        assertEquals(man.getGender(), Gender.MALE);
    }
}
