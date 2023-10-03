package com.leetcode.solution.searchInsertposition;

public class Solution {
    public int searchInsert(int[] nums, int target){
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                index = i;
            } else {
                if(nums.length == 1 && nums[0] < target){
                    index = 1;
                }
                for (int t = 0; t < nums.length-1; t++) {
                    if(nums[t] < target && target < nums[t+1]){
                        index = t+1;
                    } else if(nums[nums.length-1] < target){
                        index = nums.length;
                    }
                }
            }
        }

        return index;
    }
}
