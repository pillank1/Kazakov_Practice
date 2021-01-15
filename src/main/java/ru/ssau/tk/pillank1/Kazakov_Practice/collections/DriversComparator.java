package ru.ssau.tk.pillank1.Kazakov_Practice.collections;

import ru.ssau.tk.pillank1.Kazakov_Practice.dataTypes.person.Gender;

import java.util.Comparator;

public class DriversComparator implements Comparator<Driver> {
    @Override
    public int compare(Driver driver1, Driver driver2) {
        if (driver1.getGender() != driver2.getGender()) {
            if (driver1.getGender() == Gender.FEMALE) {
                return -1;
            } else {
                return 1;
            }
        } else {
            return Long.compare(driver1.getLicenseExpirationDate().getTime(), driver2.getLicenseExpirationDate().getTime());
        }
    }
}
