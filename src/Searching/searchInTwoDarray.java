package Searching;

import java.util.Arrays;

public class searchInTwoDarray {
    public static void main(String[] args) {
        int[][] arr={
                {1,3,4,5,67},
                {12,23,43,2,4},
                {14,234,45}
        };
        int target=67;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] search(int arr[][],int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{-1,-1};
    }
}
