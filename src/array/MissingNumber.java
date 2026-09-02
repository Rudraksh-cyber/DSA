import java.util.Arrays;
import java.util.List;

/**
 * Finds a missing number from a sequence containing numbers from 1 to n.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Main {

    public static void main(String[] args) {

        // Maximum number in the expected sequence
        int n = 5;

        // List containing one missing number
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5);

        // Calculate the expected sum from 1 to n
        long expectedSum = (long) n * (n + 1) / 2;

        // Calculate the actual sum of the given numbers
        long actualSum = 0;

        for (int number : numbers) {
            actualSum += number;
        }

        // Find the missing number
        long missingNumber = expectedSum - actualSum;

        System.out.println("Missing Number: " + missingNumber);
    }
}
