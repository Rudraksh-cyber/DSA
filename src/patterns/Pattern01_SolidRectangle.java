package patterns;

/**
 * Pattern 01 - Solid Rectangle
 *
 * Output:
 * ******
 * ******
 * ******
 * ******
 * ******
 * ******
 *
 * Logic:
 * - Outer loop prints each row.
 * - Inner loop prints the same number of stars in every row.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */


public class Pattern01_SolidRectangle {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 0; row <= n; row++) {

            for (int col = 0; col <= n; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}