import com.leetcode.solution.pascalsTriangle.PascalTriangle;
import com.leetcode.solution.removeDuplicatesFromSortedArray.Solution;
//import com.leetcode.solution.removeElement.Solution;

import java.sql.SQLOutput;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
//        int[] nums = {3,2,2,3}; // Input array
//        int val = 3; // Value to remove
//        int[] expectedNums = {2,2}; // The expected answer with correct length.
//        // It is sorted with no values equaling val.
//
//        Solution solution = new Solution();
//
//        int k = solution.removeElement(nums, val); // Calls your implementation
//
//        assert k == expectedNums.length;
//        sort(nums, 0, k); // Sort the first k elements of nums
//        for (int i = 0; i < expectedNums.length; i++) {
//            assert nums[i] == expectedNums[i];
//        }

        Solution solution = new Solution();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(solution.removeDuplicates(nums));
    }
}