import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        // Step 1: Find the highest number of candies that any kid currently has.
        // We'll compare each kid's total (with extra candies) to this number.
        int maxCandies = 0;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

        // Step 2: For each kid, add the extra candies to their current count.
        // If that total is greater than or equal to the max, add true to the result list.
        // Otherwise, add false.
        for (int candy : candies) {
            if (candy + extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

    // Testing the solution with example cases
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Case 1
        int[] candies1 = {2, 3, 5, 1, 3};
        int extra1 = 3;
        System.out.println("Case 1: " + solution.kidsWithCandies(candies1, extra1));
        // Expected: [true, true, true, false, true]

        // Case 2
        int[] candies2 = {4, 2, 1, 1, 2};
        int extra2 = 1;
        System.out.println("Case 2: " + solution.kidsWithCandies(candies2, extra2));
        // Expected: [true, false, false, false, false]

        // Case 3
        int[] candies3 = {12, 1, 12};
        int extra3 = 10;
        System.out.println("Case 3: " + solution.kidsWithCandies(candies3, extra3));
        // Expected: [true, false, true]
    }
}

/*
 * Problem Explanation:
 * Each kid has some candies. We are given extraCandies.
 * We want to check, for each kid: 
 *     "If we give all extraCandies to this kid, will they have the most candies?"
 * Return a list of true/false for each kid.
 *
 * Step-by-Step Logic:
 * 1. Find the current maximum candy count (the most any kid already has).
 * 2. Go through each kid:
 *    - Add extraCandies to their current candy count.
 *    - Compare it with the max.
 *    - If it's >= max, add true to the result list, else add false.
 *
 * Time Complexity Analysis:
 * - Loop 1: Find max → O(n)
 * - Loop 2: Check each kid → O(n)
 * - So total time = O(n) + O(n) = O(2n)
 * - BUT in Big-O notation, we drop constants → O(n)
 *
 * Space Complexity:
 * - We use a list of size n to store the result → O(n)
 */
