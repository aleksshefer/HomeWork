package sorting;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        CustomArrays.initTestArray(100000, 1000);
        int[] firstArray = CustomArrays.getTestArrayCopy();
        int[] secondArray = CustomArrays.getTestArrayCopy();
        int[] thirdArray = CustomArrays.getTestArrayCopy();

        long firstArraySortTimeStart = System.nanoTime();
        CustomArrays.quickSort(firstArray);
        long firstArraySortTimeEnd = System.nanoTime();
        System.out.println("Array with length " + firstArray.length + " sorted in " + (firstArraySortTimeEnd - firstArraySortTimeStart) / 1000000f + " milliseconds using quick sort");

        long secondArraySortTimeStart = System.nanoTime();
        CustomArrays.bubbleSort(secondArray);
        long secondArraySortTimeEnd = System.nanoTime();
        System.out.println("Array with length " + secondArray.length + " sorted in " + (secondArraySortTimeEnd - secondArraySortTimeStart) / 1000000f + " milliseconds using bubble sort");

        long thirdArraySortTimeStart = System.nanoTime();
        Arrays.sort(thirdArray);
        long thirdArraySortTimeEnd = System.nanoTime();
        System.out.println("Array with length " + thirdArray.length + " sorted in " + (thirdArraySortTimeEnd - thirdArraySortTimeStart) / 1000000f + " milliseconds using Arrays.sort");
    }

}
