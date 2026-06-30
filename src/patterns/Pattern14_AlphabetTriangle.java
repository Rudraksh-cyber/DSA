/**
 * Pattern 14 - Alphabet Triangle
 *
 * Output:
 * A
 * A B
 * A B C
 * A B C D
 * A B C D E
 *
 * Logic:
 * - Start from the character 'A'.
 * - Print characters up to the current row.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern14_AlphabetTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 0; row < n; row++) {

            for (char ch = 'A'; ch <= 'A' + row; ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}