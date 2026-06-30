/**
 * Pattern 09 - Diamond
 *
 * Output:
 *      *
 *     ***
 *    *****
 *   *******
 *  *********
 * ***********
 * ***********
 *  *********
 *   *******
 *    *****
 *     ***
 *      *
 *
 * Logic:
 * - First half prints a normal pyramid.
 * - Second half prints an inverted pyramid.
 * - Combining both forms a diamond.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern09_Diamond {

    public static void main(String[] args) {

        int n = 6;

        // Upper Pyramid
        for (int row = 0; row < n; row++) {

            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }

            for (int col = 0; col < 2 * row + 1; col++) {
                System.out.print("*");
            }

            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }

            System.out.println();
        }

        // Lower Pyramid
        for (int row = 0; row < n; row++) {

            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }

            for (int col = 0; col < 2 * n - (2 * row + 1); col++) {
                System.out.print("*");
            }

            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}