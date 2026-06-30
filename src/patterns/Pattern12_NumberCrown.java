/**
 * Pattern 12 - Number Crown
 *
 * Output:
 * 1        1
 * 12      21
 * 123    321
 * 1234  4321
 * 1234554321
 *
 * Logic:
 * - Print increasing numbers.
 * - Print spaces between both halves.
 * - Print decreasing numbers.
 * - Reduce spaces by 2 after every row.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern12_NumberCrown {

    public static void main(String[] args) {

        int n = 5;
        int spaces = 2 * (n - 1);

        for (int row = 1; row <= n; row++) {

            // Left Numbers
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }

            // Spaces
            for (int col = 1; col <= spaces; col++) {
                System.out.print(" ");
            }

            // Right Numbers
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }

            System.out.println();

            spaces -= 2;
        }
    }
}