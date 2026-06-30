/**
 * Pattern 03 - Number Triangle
 *
 * Output:
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 *
 * Logic:
 * - Outer loop prints each row.
 * - Inner loop prints numbers from 1 up to the current row number.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern03_NumberTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}