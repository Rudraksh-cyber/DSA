/**
 * Pattern 15 - Inverted Alphabet Triangle
 *
 * Output:
 * A B C D E
 * A B C D
 * A B C
 * A B
 * A
 *
 * Logic:
 * - Start from 'A'.
 * - Decrease the number of printed characters after every row.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern15_InvertedAlphabetTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 0; row < n; row++) {

            for (char ch = 'A'; ch <= 'A' + (n - row - 1); ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}