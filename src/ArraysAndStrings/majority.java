package ArraysAndStrings;

import java.util.Scanner;

public class majority {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int majorityElement = findMajorityElement(array, n);
        if (majorityElement != -1) {
            System.out.println("Majority Element: " + majorityElement);
        } else {
            System.out.println("No Majority Element found.");
        }
    }
    static int findMajorityElement(int[] array, int n) {
        int candidate = findmajor(array, n);
        if (isMajority(array, n, candidate)) {
            return candidate;
        }
        return -1;
    }
    static int findmajor(int[] array, int n) {
        int count = 0, major = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                major = array[i];
                count = 1;
            } else if (array[i] == major) {
                count++;
            } else {
                count--;
            }
        }
        return major;
    }
    static boolean isMajority(int[] array, int n, int candidate) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] == candidate) {
                count++;
            }
        }
        return count > n / 2;
    }
}
