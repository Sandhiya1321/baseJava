package Searching;

import java.util.Arrays;

public class remdup {
    public static void main(String[] args) {
        int[] arr={2,2,3,4,5,5};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]){
                continue;
            }
            System.out.println(arr[i]);
        }
        System.out.println(arr[arr.length-1]);
    }
}
