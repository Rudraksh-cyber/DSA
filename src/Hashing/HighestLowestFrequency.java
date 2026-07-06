package Hashing;

import java.util.Scanner;

public class HighestLowestFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] hash = new int[1001];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            hash[arr[i]]++;
        }

        int maxFreq = 0, minFreq = n;
        int maxElement = -1, minElement = -1;

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0) {
                if (hash[i] > maxFreq) {
                    maxFreq = hash[i];
                    maxElement = i;
                }
                if (hash[i] < minFreq) {
                    minFreq = hash[i];
                    minElement = i;
                }
            }
        }

        System.out.println("Highest Frequency Element: " + maxElement);
        System.out.println("Lowest Frequency Element: " + minElement);

        sc.close();
    }
}