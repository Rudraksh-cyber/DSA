/**
 * Pattern 22 - Concentric Number Square
 *
 * Output:
 * 4 4 4 4 4 4 4
 * 4 3 3 3 3 3 4
 * 4 3 2 2 2 3 4
 * 4 3 2 1 2 3 4
 * 4 3 2 2 2 3 4
 * 4 3 3 3 3 3 4
 * 4 4 4 4 4 4 4
 *
 * Logic:
 * - Find the minimum distance of each cell from the four boundaries.
 * - Subtract this minimum distance from the outermost number.
 * - This creates concentric square layers.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern22_ConcentricNumberSquare {

    public static void main(String[] args) {

        int n = 7;

        for (int row = 0; row < n; row++) {

            for (int col = 0; col < n; col++) {

                int left = col;
                int right = n - 1 - col;
                int top = row;
                int bottom = n - 1 - row;

                int minimumDistance = Math.min(
                        Math.min(left, right),
                        Math.min(top, bottom)
                );

                int value = (n / 2 + 1) - minimumDistance;

                System.out.print(value + " ");
            }

            System.out.println();
        }
    }
}