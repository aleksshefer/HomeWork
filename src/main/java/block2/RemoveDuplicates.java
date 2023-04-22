package block2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Реализуй метод, который на вход примет ArrayList строк и удаляет из него все дубликаты,
 * не используя метод contains(). Можно использовать другие коллекции, которые были изучены на уроке.
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("c");

        System.out.println(arrayList);
        System.out.println(removeDupes(arrayList));
    }

    private static ArrayList<String> removeDupes(ArrayList<String> inputList) {
        Set<String> resultSet = new HashSet<>(inputList);
        return new ArrayList<>(resultSet);
    }
}
