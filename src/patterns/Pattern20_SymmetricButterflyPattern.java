/**
 * Pattern 20 - Symmetric Butterfly Pattern
 *
 * Output:
 * *        *
 * **      **
 * ***    ***
 * ****  ****
 * **********
 * ****  ****
 * ***    ***
 * **      **
 * *        *
 *
 * Logic:
 * - Print increasing stars with decreasing spaces.
 * - After reaching the middle, reverse the process.
 * - The pattern resembles a butterfly.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern20_SymmetricButterflyPattern {

    public static void main(String[] args) {

        int n = 5;

        // Upper Half
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            for (int col = 1; col <= 2 * (n - row); col++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for (int row = n - 1; row >= 1; row--) {

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            for (int col = 1; col <= 2 * (n - row); col++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}