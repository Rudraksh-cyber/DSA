package array;
public class SecondLargestElement {

    public static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 2, 15, 7, 10};

        System.out.println("Second Largest Element: " + secondLargest(arr));
    }
}