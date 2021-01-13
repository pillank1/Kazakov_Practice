package ru.ssau.tk.pillank1.Kazakov_Practice.dataTypes.person;

public class CreatingPersons_1_2 {
    public static void main(String[] args) {
        Person firstObj = new Person();
        Person secondObj = new Person("Vladimir", "Solovev");
        Person thirdObj = new Person(122044);
        Person fourthObj = new Person("Dmitry", "Kiselev", 331515);
        System.out.println("The first journalist: " + firstObj.getFirstName() + ' ' + firstObj.getLastName() + ", passport " + firstObj.getPassportId());
        System.out.println("The second journalist: " + secondObj.getFirstName() + ' ' + secondObj.getLastName() + ", passport " + secondObj.getPassportId());
        System.out.println("The third journalist: " + thirdObj.getFirstName() + ' ' + thirdObj.getLastName() + ", passport " + thirdObj.getPassportId());
        System.out.println("The fourth journalist: " + fourthObj.getFirstName() + ' ' + fourthObj.getLastName() + ", passport " + fourthObj.getPassportId());
    }
}
