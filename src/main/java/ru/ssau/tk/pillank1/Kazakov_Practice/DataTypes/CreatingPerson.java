package ru.ssau.tk.pillank1.Kazakov_Practice.DataTypes;

public class CreatingPerson {
    public static void main(String[] args) {
        Person firstPerson = new Person();
        Person secondPerson = new Person();

        firstPerson.setFirstName("Vladimir");
        firstPerson.setLastName("Bogatyrev");
        firstPerson.setPassportId(335011);

        secondPerson.setFirstName("Dmitry");
        secondPerson.setLastName("Gordon");
        secondPerson.setPassportId(312047);

        System.out.println(firstPerson.getLastName() + ' ' + firstPerson.getFirstName() + "; passport: " + firstPerson.getPassportId());
        System.out.println(secondPerson.getLastName() + ' ' + secondPerson.getFirstName() + "; passport: " + secondPerson.getPassportId());
    }
}
