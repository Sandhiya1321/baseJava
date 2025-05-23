package Arrays;

import java.util.Arrays;

public class moveNeg {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, -2, 4};
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            if (arr[start] < 0) {
                start++;
            } else if (arr[end] >= 0) {
                end--;
            } else {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
