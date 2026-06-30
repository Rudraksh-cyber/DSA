/**
 * Pattern 10 - Half Diamond
 *
 * Output:
 * *
 * **
 * ***
 * ****
 * *****
 * ******
 * *****
 * ****
 * ***
 * **
 * *
 *
 * Logic:
 * - Increase stars from 1 to n.
 * - Then decrease stars back to 1.
 * - Use a variable to determine the number of stars.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

public class Pattern10_HalfDiamond {

    public static void main(String[] args) {

        int n = 6;

        for (int row = 1; row <= 2 * n - 1; row++) {

            int stars = row;

            if (row > n) {
                stars = 2 * n - row;
            }

            for (int col = 1; col <= stars; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}