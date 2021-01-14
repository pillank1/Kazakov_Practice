package ru.ssau.tk.pillank1.Kazakov_Practice.collections;

import org.testng.annotations.Test;
import ru.ssau.tk.pillank1.Kazakov_Practice.dataTypes.person.Gender;
import ru.ssau.tk.pillank1.Kazakov_Practice.dataTypes.person.Person;

import java.util.Calendar;
import java.util.Date;

import static org.testng.Assert.*;

public class DriverTest {
    Driver firstDriver = new Driver();
    Driver secondDriver = new Driver();
    Driver thirdDriver = new Driver();

    @Test
    public void testTestEquals() {
        firstDriver.setId(1);
        firstDriver.setName("Vladimir");
        firstDriver.setGender(Gender.MALE);
        firstDriver.setLicenseExpirationDate(new Date(124, Calendar.MARCH, 10));

        secondDriver.setId(2);
        secondDriver.setName("Alexey");
        secondDriver.setGender(Gender.MALE);
        secondDriver.setLicenseExpirationDate(new Date(120, Calendar.AUGUST, 20));

        thirdDriver.setId(2);
        thirdDriver.setName("Vladimir");
        thirdDriver.setGender(Gender.MALE);
        thirdDriver.setLicenseExpirationDate(new Date(136, Calendar.MARCH, 9));

        assertFalse(firstDriver.equals(thirdDriver));

        thirdDriver.setId(1);

        assertTrue(firstDriver.equals(thirdDriver));
        assertTrue(thirdDriver.equals(firstDriver));
        assertTrue(secondDriver.equals(secondDriver));
        assertFalse(firstDriver.equals(secondDriver));
        assertFalse(thirdDriver.equals(new Person()));
        assertFalse(secondDriver.equals(null));
    }

    @Test
    public void testTestToString() {
        firstDriver.setId(1);
        firstDriver.setName("Vladimir");
        firstDriver.setGender(Gender.MALE);
        firstDriver.setLicenseExpirationDate(new Date(124, Calendar.MARCH, 10));

        secondDriver.setId(2);
        secondDriver.setName("Alexey");
        secondDriver.setGender(Gender.MALE);
        secondDriver.setLicenseExpirationDate(new Date(120, Calendar.AUGUST, 20));

        assertEquals(firstDriver.toString(), "Driver: ID: 1; Name: Vladimir; Gender: MALE; LicenseExpirationDate: Sun Mar 10 00:00:00 SAMT 2024.");
        assertEquals(secondDriver.toString(), "Driver: ID: 2; Name: Alexey; Gender: MALE; LicenseExpirationDate: Thu Aug 20 00:00:00 SAMT 2020.");
    }
}