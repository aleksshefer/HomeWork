package block1.firstprograms.calculator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            calculator.start();
        } catch (IOException e) {
            System.out.println("Возникла ошибка при вводе");
        } catch (ResultsOutOfBoundException e) {
            System.out.println("Сохранено максимальное колтчесвто результатов!");
            calculator.getResults();
        }
    }
}
