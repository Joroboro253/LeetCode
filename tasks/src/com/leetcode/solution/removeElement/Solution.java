package com.leetcode.solution.removeElement;

public class Solution {
    // Удалить все вхождения числа в массив
    // Вернуть число элементов не равно числу
    public int removeElement(int[] nums, int val) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                // Подсчёт количество чисел, которые не равны k
                nums[counter]=nums[i];
                counter++;
            }
        }

        return counter;
    }
}
