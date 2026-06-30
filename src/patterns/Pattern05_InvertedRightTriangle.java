/**
 * Pattern 05 - Inverted Right Triangle
 *
 * Output:
 * * * * *
 * * * *
 * * *
 * *
 * *
 *
 * Logic:
 * - Outer loop starts from n and decreases.
 * - Inner loop prints stars equal to the current row value.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern05_InvertedRightTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int row = n; row >= 1; row--) {

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}