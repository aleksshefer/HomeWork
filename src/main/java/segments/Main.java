package segments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "/home/aleksandr/IdeaProjects/HomeWork/src/main/java/segments/lines.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            Optional<Double> max = reader
                    .lines()
                    .map(s -> {
                        int[] array = new int[4];
                        Pattern pat = Pattern.compile("-?[0-9]+(.[0-9]+)?");
                        Matcher matcher = pat.matcher(s);
                        int i = 0;

                        while (matcher.find()) {
                            array[i] = Integer.parseInt(matcher.group());
                            i++;
                        }
                        return Math.sqrt(Math.pow(array[2] - array[0], 2) + Math.pow(array[3] - array[1], 2));
                    })
                    .max(Double::compareTo);

            System.out.println(max.orElse((double) 0));
        }
    }
}
