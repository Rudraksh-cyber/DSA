/**
 * Pattern 04 - Same Number Triangle
 *
 * Output:
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 *
 * Logic:
 * - Outer loop controls the current row number.
 * - Inner loop prints the row number repeatedly.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern04_SameNumberTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }

            System.out.println();
        }
    }
}