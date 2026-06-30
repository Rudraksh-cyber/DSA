/**
 * Pattern 06 - Inverted Number Triangle
 *
 * Output:
 * 1 2 3 4 5
 * 1 2 3 4
 * 1 2 3
 * 1 2
 * 1
 *
 * Logic:
 * - Outer loop decreases the number of rows.
 * - Inner loop prints numbers from 1 up to the current row length.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern06_InvertedNumberTriangle {

    public static void main(String[] args) {

        int n = 6;

        for (int row = n; row >= 1; row--) {

            for (int col = 1; col < row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}