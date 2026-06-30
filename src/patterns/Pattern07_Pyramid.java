/**
 * Pattern 07 - Pyramid
 *
 * Output:
 *      *
 *     ***
 *    *****
 *   *******
 *  *********
 * ***********
 *
 * Logic:
 * - Print leading spaces to center the pyramid.
 * - Print an odd number of stars in each row.
 * - Stars increase by 2 in every new row.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern07_Pyramid {

    public static void main(String[] args) {

        int n = 6;

        for (int row = 0; row < n; row++) {

            // Print leading spaces
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }

            // Print stars
            for (int col = 0; col < 2 * row + 1; col++) {
                System.out.print("*");
            }

            // Print trailing spaces (optional)
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}