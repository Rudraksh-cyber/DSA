/**
 * Pattern 19 - Symmetric Void Pattern
 *
 * Output:
 * *****     *****
 * ****       ****
 * ***         ***
 * **           **
 * *             *
 * **           **
 * ***         ***
 * ****       ****
 * *****     *****
 *
 * Logic:
 * - The upper half prints decreasing stars with increasing spaces.
 * - The lower half prints increasing stars with decreasing spaces.
 * - The pattern is symmetric about the horizontal axis.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern19_SymmetricVoidPattern {

    public static void main(String[] args) {

        int n = 5;

        // Upper Half
        for (int row = 0; row < n; row++) {

            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }

            for (int col = 0; col < 2 * row; col++) {
                System.out.print(" ");
            }

            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for (int row = 0; row < n; row++) {

            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }

            for (int col = 0; col < 2 * (n - row - 1); col++) {
                System.out.print(" ");
            }

            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}