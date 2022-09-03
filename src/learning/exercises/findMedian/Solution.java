package learning.exercises.findMedian;

import java.util.Arrays;

public class Solution {

    /*
    2 int array parameters
    we create a result array with the combined length of the 2 known arrays
    the first for loop adds the numbers from nums1 into the result int array
    the second for loop adds the numbers from nums2 into the result array beginning
    from the index where nums1 ended (so the newly added numbers from nums2 do not overwrite
    the previous ones, but are added).
    then we sort them with a derived array sorting function.
    the return is the median from the sorted result array, the number in the middle.
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length+nums2.length];


        for (int i = 0; i < nums1.length; i++) {
            result[i] = nums1[i];


        }
        for (int i = 0; i < nums2.length; i++) {
            result[(nums1.length-1)+i] = nums2[i];
        }

        Arrays.sort(result);
        return (result[(result.length-1)/2]+1);
    }
}
