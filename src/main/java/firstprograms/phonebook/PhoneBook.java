package firstprograms.phonebook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneBook {
    public Person[] persons = new Person[10];

    public PhoneBook() {
        initDB();
    }

    private void initDB() {
        persons[0] = new Person("Юля", "89210000000", "Julia@yandex.com");
        persons[1] = new Person("Сергей", "777777", "borya@yandex.com");
        persons[2] = new Person("Друган", "23566777", "univer@yandex.com");
        persons[3] = new Person("EvilBoss", "456546546", "boss@yandex.com");
        persons[4] = new Person("Anna", "+79216661666", "mylove@yandex.com");
    }


    public Person findPerson(String string) {
        String str = string.substring(1);
        for (Person person : persons) {
            if (person == null) {
                return null;
            } else if (person.toString().contains(str)) {
                return person;
            }
        }
        return null;
    }


    public void start() {
        String inputString;
        Person person;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("\nДля выхода введите \"выход\"");
                System.out.print("Введите значение для поиска: ");

                inputString = br.readLine();

                if (inputString.equals("выход")) {
                    break;
                }

                person = findPerson(inputString);

                if (person == null) {
                    System.out.println("Нет такого человека");
                } else {
                    System.out.println("Человек найден: " + person);
                }
            }
        } catch (IOException exception) {
            System.out.println("Ошибка при вводе");
        }
    }
}
