import java.util.*;

public class Solution {

    /**
     * Returns a list of strings representing the FizzBuzz sequence from 1 to n.
     * - If a number is divisible by 3, add "Fizz"
     * - If divisible by 5, add "Buzz"
     * - If divisible by both, add "FizzBuzz"
     * - Otherwise, add the number itself as a string
     */
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>(n); // Preallocate space for n strings

        for (int i = 1; i <= n; i++) {
            String current = "";

            // If divisible by 3, append "Fizz"
            if (i % 3 == 0) current += "Fizz";

            // If divisible by 5, append "Buzz"
            if (i % 5 == 0) current += "Buzz";

            // If not divisible by 3 or 5, just use the number itself
            if (current.equals("")) current = Integer.toString(i);

            result.add(current);
        }

        return result;
    }

    /**
     * Main method to test fizzBuzz with different values of n.
     * Includes typical cases and edge cases.
     */
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1: n = 3
        System.out.println("n = 3 → " + solution.fizzBuzz(3));
        // Expected: ["1", "2", "Fizz"]

        // Test Case 2: n = 5
        System.out.println("n = 5 → " + solution.fizzBuzz(5));
        // Expected: ["1", "2", "Fizz", "4", "Buzz"]

        // Test Case 3: n = 15
        System.out.println("n = 15 → " + solution.fizzBuzz(15));
        // Expected: ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"]

        // Edge Case: n = 1
        System.out.println("n = 1 → " + solution.fizzBuzz(1));
        // Expected: ["1"]

        // Edge Case: n = 0
        System.out.println("n = 0 → " + solution.fizzBuzz(0));
        // Expected: [] (empty list)
    }
}

/*
 * Problem Explanation:
 * For numbers from 1 to n:
 * - If divisible by 3 → replace with "Fizz"
 * - If divisible by 5 → replace with "Buzz"
 * - If divisible by both 3 and 5 → "FizzBuzz"
 * - Else → use the number as a string
 *
 * Step-by-Step:
 * 1. Create a result list with size n.
 * 2. Loop from 1 to n:
 *    - Use string concatenation to build result for each number.
 *    - Add it to the list.
 *
 * Time Complexity: O(n)
 * - We loop once from 1 to n.
 * - Each iteration takes constant time (O(1)):
 *   - Modulo checks (%)
 *   - String operations for short strings
 * - So total time = O(n)
 *
 * Space Complexity: O(n)
 * - We store one string per number → n strings in total
 * - No other data structures scale with input size
 * - So total space = O(n)
 */
