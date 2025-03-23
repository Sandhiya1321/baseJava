package sortingAndSearching;

import java.util.Arrays;
public class kthelement {
    public static int findKthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static int findKthLargest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;

        System.out.println("Kth Smallest: " + findKthSmallest(arr, k));
        System.out.println("Kth Largest: " + findKthLargest(arr, k));
    }
}

