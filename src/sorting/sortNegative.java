package sorting;

import java.util.Arrays;

public class sortNegative {
    public static void main(String[] args) {
        int[] arr={1,-1,3,-2,4};
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
