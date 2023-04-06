package basesyntax;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        String friendName;
        int friendAge;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Расскажите о свем друге");
        System.out.println("Как зовут вашего друга?");

        friendName = scanner.nextLine();

        System.out.println("Сколько лет вашему другу?");

        friendAge = Integer.parseInt(scanner.nextLine());

        System.out.println("Моему другу " + friendName + " сейчас " + friendAge + " лет");
    }
}
