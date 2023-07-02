package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RollingAverage {
    public static void main(String[] args) {
        ArrayList<Integer> testArray = new ArrayList<>(Arrays.asList(1, 2, 3, 5));

        System.out.println(testArray);
        System.out.println(getRollingAverage(testArray, 2));
    }

    public static List<Double> getRollingAverage(ArrayList<Integer> arr, int k) {
        int steps = arr.size() - k + 1;
        int average = 0;
        List<Double> result = new ArrayList<>(steps);

        for (int targetIndex = 0; targetIndex < steps; targetIndex++) {

            for (int resultIndex = targetIndex; resultIndex < targetIndex + k; resultIndex++) {
                average += arr.get(resultIndex);
            }
            result.add(((double) average / k));
            average = 0;
        }
        return result;
    }
}