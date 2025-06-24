import java.util.*;

public class Solution {

    /**
     * Returns the indices of the two numbers such that they add up to the target.
     * Uses a HashMap to store previously seen numbers and their indices.
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int complement = target - current;

            // Check if the complement has already been seen
            if (seen.containsKey(complement)) {
                // Found the pair → return their indices
                return new int[] { seen.get(complement), i };
            }

            // Otherwise, store the current number with its index
            seen.put(current, i);
        }

        // If no solution found (problem guarantees one), return empty array
        return new int[0];
    }

    // Main method to test various inputs
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Case 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Case 1: " + Arrays.toString(solution.twoSum(nums1, target1)));
        // Expected: [0, 1]

        // Case 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println("Case 2: " + Arrays.toString(solution.twoSum(nums2, target2)));
        // Expected: [1, 2]

        // Case 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        System.out.println("Case 3: " + Arrays.toString(solution.twoSum(nums3, target3)));
        // Expected: [0, 1]

        // Edge Case
        int[] nums4 = {1, 2};
        int target4 = 3;
        System.out.println("Edge Case: " + Arrays.toString(solution.twoSum(nums4, target4)));
        // Expected: [0, 1]
    }
}

/*
 * Problem Explanation:
 * Given an array of integers and a target value, find two indices such that
 * the numbers at those indices add up to the target.
 * 
 * Approach:
 * - Loop through the array.
 * - For each number, calculate the "complement" needed to reach the target.
 * - Use a HashMap to check if the complement has been seen before.
 * - If yes, return the indices of the complement and the current number.
 *
 * Time Complexity: O(n)
 * - We traverse the array once (n elements).
 * - All lookups and insertions in HashMap are O(1) on average.
 *
 * Space Complexity: O(n)
 * - In the worst case, we store all n elements in the HashMap.
 */
