package block1.leetcode;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        int max;
        int end = array.length - 1;
        for (int k = 0; k < array.length-1; k++) {

            for (int i = 0; i < end; i++) {

                if (array[i] > array[i+1]) {
                    max = array[i];
                    array[i] = array[i+1];
                    array[i + 1] = max;
                }
            }
            end--;
        }
    }
}
