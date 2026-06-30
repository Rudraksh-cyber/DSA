/**
 * Pattern 18 - Butterfly Pattern
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
 * - The inner gap changes by 2 spaces after every row.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern18_ButterflyPattern {

    public static void main(String[] args) {

        int n = 5;
        int innerSpaces = 0;

        // Upper Half
        for (int row = 0; row < n; row++) {

            for (int col = 1; col <= n - row; col++) {
                System.out.print("*");
            }

            for (int col = 0; col < innerSpaces; col++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= n - row; col++) {
                System.out.print("*");
            }

            innerSpaces += 2;

            System.out.println();
        }

        innerSpaces = 2 * n - 2;

        // Lower Half
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            for (int col = 0; col < innerSpaces; col++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            innerSpaces -= 2;

            System.out.println();
        }
    }
}