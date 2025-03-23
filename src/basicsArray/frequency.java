package basicsArray;

import java.util.Arrays;

public class frequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 4, 3, 3, 1};
        count(arr);
    }

    public static void count(int[] arr) {
        Arrays.sort(arr);//1,1,2,3,3,4,5,7
        System.out.println("Element | Frequency");

        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.println(arr[i - 1] + "       | " + count);
                count = 1;
            }
        }

        System.out.println(arr[arr.length - 1] + "       | " + count);
    }
}

