package block1.leetcode;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 4};
        Solution solution = new Solution();

        System.out.println(solution.findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int firstCount = 0;
        int secondCount = 0;
        int resultCount = 0;
        boolean endOfNums1 = firstCount == nums1.length;
        boolean endOfNums2 = secondCount == nums2.length;
        int[] resultArray = new int[nums1.length + nums2.length];

        while (!endOfNums1 || !endOfNums2) {

            if (!endOfNums1 && !endOfNums2) {

                if (nums1[firstCount] <= nums2[secondCount]) {
                    resultArray[resultCount++] = nums1[firstCount++];
                } else {
                    resultArray[resultCount++] = nums2[secondCount++];
                }
            }
            if (endOfNums2) {
                resultArray[resultCount++] = nums1[firstCount++];
            }

            if (endOfNums1) {
                resultArray[resultCount++] = nums2[secondCount++];
            }

            endOfNums1 = firstCount == nums1.length;
            endOfNums2 = secondCount == nums2.length;
        }
        System.out.println(Arrays.toString(resultArray));
        double median;
        if ((resultArray.length % 2) == 0) {
            median = (double) (resultArray[resultArray.length / 2 - 1] + resultArray[resultArray.length / 2]) / 2;
        } else {
            median = resultArray[resultArray.length / 2];
        }
        return median;
    }
}
