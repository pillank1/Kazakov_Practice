package ru.ssau.tk.pillank1.Kazakov_Practice.DataTypes.Person;

public class ClassForChecking {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Arkadiy");
        checkAnotherPerson(person);
        System.out.println(person.getFirstName());
    }

    private static void checkAnotherPerson(Person person) {
        person = new Person();
        person.setFirstName("Ignat");
        System.out.println(person.getFirstName());
    }

/*
Вывод в консоль:
Ignat
Arkadiy
Поначалу идет выполнение метода checkAnotherPerson(). Он создает новый объект person, при этом присваивает ему ссылку внутри метода.
Затем в методе передается имя (Ignat) и выводится в консоль. После выполнения метода сборщик мусора уничтожает ссылку на созданный объект.
Потом выводится имя (Arkadiy), которое было определено в main для объекта person.
 */
}
