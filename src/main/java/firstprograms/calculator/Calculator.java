package firstprograms.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Calculator {
    private final String[] results;
    private static final Pattern PATTERN;

    static {
        PATTERN = Pattern.compile("^(\\d+\\.\\d+|\\d+)[*/\\-+](\\d+\\.\\d+|\\d+)");
    }

    public Calculator() {
        this.results = new String[10];
    }

    public void start() throws IOException, ResultsOutOfBoundException {
        String inputString;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.print("Для выхода введите \"выход\". \n Введите выражение: ");
                inputString = reader.readLine();

                if (inputString.equals("выход")) {
                    break;
                }

                if (isMatches(inputString)) {
                    inputString = String.format("%s = %.2f\n", inputString, calculate(inputString));
                    addResult(inputString);
                    System.out.printf(inputString);
                } else {
                    System.out.println("Неверное выражение!");
                }
            }
        }
    }

    private boolean isMatches(String inputString) {
        return PATTERN.matcher(inputString).matches();
    }

    private double calculate(String string) {
        String[] strings;

        if (string.contains("*")) {
            strings = string.split("\\*");
            return Double.parseDouble(strings[0]) * Double.parseDouble(strings[1]);

        } else if (string.contains("-")) {
            strings = string.split("-");
            return Double.parseDouble(strings[0]) - Double.parseDouble(strings[1]);

        } else if (string.contains("+")) {
            strings = string.split("\\+");
            return Double.parseDouble(strings[0]) + Double.parseDouble(strings[1]);

        } else if (string.contains("/")) {
            strings = string.split("/");
            return Double.parseDouble(strings[0]) / Double.parseDouble(strings[1]);
        }
        return 0;
    }

    private void addResult(String result) throws ResultsOutOfBoundException {
        for (int i = 0; i < results.length; i++) {
            if (results[i] == null) {
                results[i] = result;
                break;
            } else if (i == (results.length - 1)) {
                throw new ResultsOutOfBoundException("Сохранено максимальное колтчество результатов!");
            }
        }
    }

    public void getResults() {
        System.out.println(Arrays.toString(results));
    }
}
