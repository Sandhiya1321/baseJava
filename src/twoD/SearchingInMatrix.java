package twoD;

import java.util.Arrays;

//o(n2)
public class SearchingInMatrix {
    public static void main(String[] args) {
        int[][] arr={{12,13,14},
                {1,24,45},
                {145,56,67}};
        int target=45;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] search(int[][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
    static String search1(int[][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return "Found";
                }
            }
        }
        return "Not found";
    }
}
