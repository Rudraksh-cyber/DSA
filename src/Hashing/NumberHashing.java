package Hashing;

import java.util.Scanner;

public class NumberHashing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Precompute frequencies
        int[] hash = new int[1001]; // Supports numbers from 0 to 1000

        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        // Number of queries
        System.out.print("Enter the number of queries: ");
        int q = sc.nextInt();

        // Answer queries
        while (q-- > 0) {
            System.out.print("Enter number to find frequency: ");
            int number = sc.nextInt();

            if (number >= 0 && number < hash.length) {
                System.out.println(number + " appears " + hash[number] + " time(s).");
            } else {
                System.out.println("Number is out of supported range (0-1000).");
            }
        }

        sc.close();
    }
}