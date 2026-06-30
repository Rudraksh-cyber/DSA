/**
 * Pattern 17 - Reverse Alphabet Triangle
 *
 * Output:
 * E
 * D E
 * C D E
 * B C D E
 * A B C D E
 *
 * Logic:
 * - Determine the starting alphabet for each row.
 * - Continue printing characters until the last alphabet.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern17_ReverseAlphabetTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 0; row < n; row++) {

            for (char ch = (char) ('A' + n - 1 - row);
                 ch <= (char) ('A' + n - 1);
                 ch++) {

                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}