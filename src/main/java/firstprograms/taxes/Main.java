package firstprograms.taxes;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d+\\.\\d+|\\d+");
        double price;
        String[] prices = {"50.3", "148.9", "1075.6", "11289.7", "asda"};

        for (String arg : prices) {
            if (pattern.matcher(arg).matches()) {
                price = Double.parseDouble(arg);

                if (price > 0 && price <= 100)
                    printResult(price, price * 0.1);

                if (price > 100 && price <= 1000)
                    printResult(price, price * 0.2);

                if (price > 1000 && price <= 10000)
                    printResult(price, price * 0.3);
            }
        }
    }

    public static void printResult(double price, double tax) {
        System.out.printf("Цена: %.2f, налог: %.2f\n", price, tax);
    }
}

