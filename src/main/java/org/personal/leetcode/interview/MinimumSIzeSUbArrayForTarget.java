package org.personal.leetcode.interview;

public class MinimumSIzeSUbArrayForTarget {

    public static void main(String[] args) {

        int[] nums = {2,3,1,2,4,3};
        int target = 7;

        int low = 0;
        int high = 0;
        int n = nums.length;
        int minWindow = Integer.MAX_VALUE;
        int sum = 0;

        for(int i = 0; i<n; i++) {

            sum = sum + nums[high];
            high++;

            while (sum >= target) {
                int currWindow = high - low;
                minWindow = Math.min(minWindow, currWindow);

                sum = sum - nums[low];
                low++;
            }
        }

        System.out.println(minWindow);
    }
}
