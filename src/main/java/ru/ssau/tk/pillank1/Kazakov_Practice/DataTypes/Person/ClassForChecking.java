package ru.ssau.tk.pillank1.Kazakov_Practice.DataTypes.Person;

public class ClassForChecking {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Arkadiy");
        int number = 5;
        checkInt(number);
        checkPerson(person);
        System.out.println(number);
        System.out.println(person.getFirstName());
    }

    private static void checkInt(int number) {
        number = 10;
        System.out.println(number);
    }

    private static void checkPerson(Person person) {
        person.setFirstName("Oleg");
        System.out.println(person.getFirstName());
    }
/*
Вывод в консоль:
10
Oleg
5
Oleg
Первым делом выполняется метод checkInt(). Аргумент number - аргумент-примитив, что означает, что его можно редактировать. Это и было сделано внутри метода.
Далее выполняется метод checkPerson(), в котором передается аргумент ссылочного типа. Это приводит к тому, что после выполнения метода значение ссылки объекта person изменится.
Затем main выведет number = 5, т.к. копия с number = 10 осталась в методе checkInt(), а имя выведет Oleg, потому что вызванный ранее метод checkPerson() поменял значение ссылки объекта person.
 */
}
