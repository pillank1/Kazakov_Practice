package ru.ssau.tk.pillank1.Kazakov_Practice.dataTypes.person;

public class Person {
    private String firstName, lastName;
    private int passportId;
    private Gender gender;

    public Person() {

    }

    public Person(Gender gender) {
        this.gender = gender;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(int passportId) {
        this.passportId = passportId;
    }

    public Person(String firstName, String lastName, int passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }

    public Person(String firstName, String lastName, int passportId, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPassportId() {
        return passportId;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return firstName + (firstName.isEmpty() || lastName.isEmpty() ? "" : " ") + lastName;
    }
}

