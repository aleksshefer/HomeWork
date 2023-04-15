package strings;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkWithString {
    public static void main(String[] args) {
        String str = "Санкт-Петербург был основан в %d году %s . За свою историю он носил имена: %s, %s, %s. Сейчас многие зовут " +
                "его просто “%s”.";
        Integer integer = 1703;
        String a = "Петром Первым";
        String[] arrayNames = {"Санкт-Петербург", "Петроград", "Ленинград"};
        String b = "Питер";

        System.out.printf((str) + "%n", integer, a, arrayNames[0], arrayNames[1], arrayNames[2], b);
        Pattern pattern = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$");
        Matcher matcher = pattern.matcher("192.168.0.111");
        System.out.println(matcher.matches());
    }
}
