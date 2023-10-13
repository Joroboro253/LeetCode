package com.leetcode.solution.singleNumber;

//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//        You must implement a solution with a linear runtime complexity and use only constant extra space.

public class Main {
    public static void main(String[] args) {
//        int[] nums = new int [] {2,2,1};
        int[] nums = new int [] {4,1,2,1,2};
//        int[] nums = new int [] {1};
//        int[] nums = new int [] {1,0,1};
        Solution solution = new Solution();

        System.out.println(solution.singleNumber(nums));
    }
}
