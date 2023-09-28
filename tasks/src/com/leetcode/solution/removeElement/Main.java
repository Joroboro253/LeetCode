package com.leetcode.solution.removeElement;

public class Main {


    public static void main(String[] args) {
//        int[] nums = {3,2,2,3};
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
//        int[] expectedNums = {2, 2};
        Solution solution = new Solution();
        int k = solution.removeElement(nums, val);

    }

}
