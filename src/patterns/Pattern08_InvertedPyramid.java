/**
 * Pattern 08 - Inverted Pyramid
 *
 * Output:
 * ***********
 *  *********
 *   *******
 *    *****
 *     ***
 *      *
 *
 * Logic:
 * - Print increasing leading spaces.
 * - Print decreasing odd number of stars.
 * - Stars decrease by 2 in every row.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern08_InvertedPyramid {

    public static void main(String[] args) {

        int n = 6;

        for (int row = 0; row < n; row++) {

            // Print leading spaces
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }

            // Print stars
            for (int col = 0; col < 2 * n - (2 * row + 1); col++) {
                System.out.print("*");
            }

            // Print trailing spaces (optional)
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}