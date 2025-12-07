package Searching;

import java.util.Arrays;

public class maxInTwoD {
    public static void main(String[] args) {
        int[][] arr={
                {1,3,4,5,67},
                {12,23,43,2,4},
                {14,234,45}
        };

        System.out.println(max(arr));
    }
    static int max1(int arr[][]){
        int max=Integer.MIN_VALUE;
        for (int[] in:arr) {
            for (int out:in) {
                if(out>max){
                    max=out;

                }
            }

        }
        return max;
    }
    static int max(int arr[][]){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               if(arr[i][j]>max){
                   max=arr[i][j];

                }
            }

        }
        return max;
    }
}
