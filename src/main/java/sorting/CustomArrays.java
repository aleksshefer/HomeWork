package sorting;

public class CustomArrays {
    private static int[] testArray;

    public static void initTestArray(int capacity, int range) {
        testArray = new int[capacity];

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = (int) (Math.random() * range);
        }
    }

    public static int[] getTestArrayCopy() {
        int[] copiedTestArray = new int[testArray.length];
        System.arraycopy(testArray, 0, copiedTestArray, 0, testArray.length);
        return copiedTestArray;
    }

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int low, int high) {
        if (array.length <= 1) {
            return;
        }
        if (low >= high) {
            return;
        }
        int supportIndex = low + (high - low) / 2;
        int supportElement = array[supportIndex];
        int start = low;
        int end = high;

        while (start <= end) {
            while (array[start] < supportElement) {
                start++;
            }

            while (array[end] > supportElement) {
                end--;
            }

            if (start <= end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
        }

        if (low < end) quickSort(array, low, end);
        if (high > start) quickSort(array, start, high);
    }

    public static void bubbleSort(int[] array) {
        int end = array.length - 1;

        while (end!=1){

            for (int k = 0; k < end; k++) {
                if (array[k] > array[k + 1]) {
                    int temp = array[k];
                    array[k ] = array[k+1];
                    array[k + 1] = temp;
                }
            }
            end--;
        }
    }
}
