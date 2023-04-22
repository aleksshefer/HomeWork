package block2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Реализуй метод, в котором создаются ArrayList, LinkedList и
 * заполняются 1 000 000 случайными элементами одного и того же типа.
 * После из ArrayList и LinkedList 1000 раз выбираем элемент по случайному индексу.
 * Замерь время для ArrayList и LinkedList. Сравни результаты и предположи, почему они могут отличаться.
 */
public class Lists {
    public static void main(String[] args) {
        long linkedListTime;
        long arrayListTime;
        Integer[] testArray;

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        fillTheList(integerArrayList);
        fillTheList(integerLinkedList);

        arrayListTime = System.currentTimeMillis();
        testArray = getThousandElements(integerArrayList);
        arrayListTime = System.currentTimeMillis() - arrayListTime;
        //в среднем отрабатывает за 1 мс

        linkedListTime = System.currentTimeMillis();
        testArray = getThousandElements(integerLinkedList);
        linkedListTime = System.currentTimeMillis() - linkedListTime;
        //в среднем отрабатывает за 1652 мс

        System.out.println(arrayListTime);

        System.out.println(linkedListTime);
    }

    //В ArrayList очень быстрый доступ по индексу,
    //в то время как в LinkedList каждый раз происходит итерация до заданного индекса

    private static void fillTheList(List<Integer> list) {
        for (int i = 0; i < 1000000; i++) {
            list.add((int) (Math.random() * 1000));
        }
    }

    private static Integer[] getThousandElements(List<Integer> list) {
        Integer[] resultArray = new Integer[1000];

        for (int i = 0; i < 1000; i++) {
            resultArray[i] = list.get((int) (Math.random() * 1000000));
        }
        return resultArray;
    }
}
