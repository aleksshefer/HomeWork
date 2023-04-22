package block2;

import java.util.HashMap;
import java.util.Map;

/**
 * Задание 1: Реализуй метод, который поменяет ключи и значения в HashMap местами.
 * На вход в метод поступает HashMap<Integer, String>, надо вернуть HashMap<String, Integer>.
 * Выведи результат.
 */
public class ConvertMap {
    public static void main(String[] args) {
        HashMap<Integer, String> testMap = new HashMap<>();
        testMap.put(1, "one");
        testMap.put(2, "two");
        testMap.put(3, "three");
        testMap.put(4, "four");
        testMap.put(5, "five");
        System.out.println(testMap);
        System.out.println(changeKeyAndValue(testMap));
    }

    private static HashMap<String, Integer> changeKeyAndValue(HashMap<Integer, String> map) {
        HashMap<String, Integer> resultMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            resultMap.put(entry.getValue(), entry.getKey());
        }
        return resultMap;
    }
}
