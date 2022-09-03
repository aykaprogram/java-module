package learning.exercises.findMedian;

import java.util.Arrays;

public class Solution {
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
