package Arrays;

import java.util.Scanner;

public class majority {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int majorEle = findMajor(array, n);
        if (majorEle != -1) {
            System.out.println( majorEle);
        } else {
            System.out.println("No Majority Element found.");
        }
    }
    static int findMajor(int[] array, int n) {
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
