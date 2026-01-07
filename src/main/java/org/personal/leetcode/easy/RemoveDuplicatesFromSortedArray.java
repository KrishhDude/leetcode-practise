package org.personal.leetcode.easy;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {

        int i = 0;
        for (int num : nums) {
            if (i < 1 || num > nums[i - 1]) {
                nums[i] = num;
                i++;
            }
        }
        return i;
    }
}
