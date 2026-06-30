/**
 * Pattern 16 - Alphabet Repetition Triangle
 *
 * Output:
 * A
 * B B
 * C C C
 * D D D D
 * E E E E E
 *
 * Logic:
 * - Determine the character for the current row.
 * - Print the same character repeatedly in that row.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern16_AlphabetRepetitionTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 0; row < n; row++) {

            char ch = (char) ('A' + row);

            for (int col = 0; col <= row; col++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}