/**
 * Pattern 11 - Binary Triangle
 *
 * Output:
 * 1
 * 1 0
 * 1 0 1
 * 1 0 1 0
 * 1 0 1 0 1
 * 1 0 1 0 1 0
 *
 * Logic:
 * - Print 1 at even column positions.
 * - Print 0 at odd column positions.
 * - Pattern depends on the column index.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern11_BinaryTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 0; row <= n; row++) {

            for (int col = 0; col <= row; col++) {

                if (col % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }

            System.out.println();
        }
    }
}