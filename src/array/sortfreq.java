package array;

import java.util.Arrays;
public class sortfreq {
    public static void main(String[] args) {
        int[] arr = {4, 4, 6, 7, 4, 6, 5};
        int n = arr.length;
        int[] frequency = new int[n];
        for (int num : arr) {
            frequency[num]++;
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (frequency[arr[i]] < frequency[arr[j]] ||
                        (frequency[arr[i]] == frequency[arr[j]] && arr[i] > arr[j])) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print the result
        System.out.println(Arrays.toString(arr));
    }
}