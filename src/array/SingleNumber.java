/**
 * Single Number
 *
 * Given a non-empty array of integers, every element appears twice
 * except for one element. Find that single element.
 *
 * Approach:
 * Use XOR.
 *
 * XOR properties:
 * - x ^ x = 0
 * - x ^ 0 = x
 * - XOR is commutative and associative
 *
 * Therefore, all duplicate elements cancel each other out,
 * leaving only the single element.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Solution {

    public int singleNumber(int[] nums) {
        int xor = 0;

        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }
}
