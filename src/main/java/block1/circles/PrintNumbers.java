package block1.circles;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sign;
        int number;

        System.out.print("Введите целое число: ");
        number = Integer.parseInt(scanner.nextLine());

        sign = (number < 0) ? -1 : 1;

        for (int i = 0; Math.abs(i) <= Math.abs(number); i += sign) {

            if (i == 0 || (i % 3 != 0 && i % 5 != 0)) {
                System.out.print(i + " ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("fizzbuzz ");
            } else if (i % 3 == 0) {
                System.out.print("fizz ");
            } else if (i % 5 == 0) {
                System.out.print("buzz ");
            }
        }
    }
}
