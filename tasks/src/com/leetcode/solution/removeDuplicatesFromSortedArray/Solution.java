package com.leetcode.solution.removeDuplicatesFromSortedArray;


//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
//
//Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
//
//Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
//Return k.
//Custom Judge:
//
//The judge will test your solution with the following code:
//
//int[] nums = [...]; // Input array
//int[] expectedNums = [...]; // The expected answer with correct length
//
//int k = removeDuplicates(nums); // Calls your implementation
//
//assert k == expectedNums.length;
//for (int i = 0; i < k; i++) {
//    assert nums[i] == expectedNums[i];
//}
//If all assertions pass, then your solution will be accepted.
//
//
//
//Example 1:
//
//Input: nums = [1,1,2]
//Output: 2, nums = [1,2,_]
//Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//It does not matter what you leave beyond the returned k (hence they are underscores).
//Example 2:
//
//Input: nums = [0,0,1,1,1,2,2,3,3,4]
//Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
//Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
//It does not matter what you leave beyond the returned k (hence they are underscores).
//
//
//Constraints:
//
//1 <= nums.length <= 3 * 104
//-100 <= nums[i] <= 100
//nums is sorted in non-decreasing order.

// Вернуть число уникальных элементов
// Нужно вернуть массив в порядке по возрастанию, и без дубликатов (дубликаты в конец и можно попробовать поставить 0)
public class Solution {
//    public int k = 0;
    int count = 0;
    public int removeDuplicates(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(i<nums.length-1 && nums[i]==nums[i+1])
            {
                continue;
            }
            else {
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
//// Сортировка в начале не нужна
////        sort(nums);
//
//        sort(nums);
//        deletingDuplicates(nums, k);
//        // Вторая сотировка, так как он теряет одну -1, когда меняет местами её с -1
//        // Плохой пример с циклом
//        while (nums[0] == -1){
//            sort(nums);
//        }
//        int sizeOfOldArray = counting(nums);
//
//
//
//        // тут выдаёт 10. Работает неверно
//
////        int[] newArr = CreateNewArray(nums, sizeOfOldArray);
////        for (int i = 0; i < sizeOfOldArray; i++) {
////            System.out.print("[" + newArr[i] + "] ");
////        }
//
//        return sizeOfOldArray;
//    }
//
//    private int[] CreateNewArray(int[] nums, int size) {
//        int[] newArray = new int[size];
//        for (int i = 0; i < size; i++) {
//                newArray[i] = nums[i];
//        }
//        return newArray;
//    }
//
//    public void deletingDuplicates(int[] nums, int size) {
//
//
//
//        int[] newArr = CreateNewArray(nums, size);
//        int j =0;
//        for (int i = 0; i < nums.length-1; i++) {
//            if(nums[i] != nums[i+1]){
//                newArr[j++] = nums[i];
//                }
//            }
//        newArr[j++] = nums[nums.length-1];
//        for (int i = 0; ; i++) {
//
//        }
//
//    }
//
//    // теперь проблема здесь
//    public int[] sort(int[] nums) {
//        boolean isSorted = false;
//        while (!isSorted)
//            isSorted = true;
//        for (int i = 0; i < nums.length - 1; i++) {
//            if(nums[i] == -1){
//                for (int j = i; j < nums.length-1; j++) {
//                    int tmp = nums[j];
//                    nums[j] = nums[j + 1];
//                    nums[j + 1] = tmp;
//                }
//            }
//
//        }
//        return nums;
//    }
//
//    public int counting(int[] nums){
//        for (int i = 0; i < nums.length - 1; i++) {
//            if(nums[i] < nums[i+1]) {
//                k++;
//            }
//        }
//        // так как прога не досчитывает один эллемент
//        k++;
//        return k;
//    }
}
