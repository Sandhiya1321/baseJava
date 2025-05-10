package twoD;

import java.util.Arrays;
//time complexity-O(n)
public class sortedRowAndCol {
    public static void main(String[] args) {
        int[][] arr={{10,20,30,40},
                     {15,25,35,45},
                     {28,29,37,49},
                     {33,34,38,50}};
        int target=60;
        System.out.println(Arrays.toString(search(arr, target)));
        System.out.println(Arrays.toString(search1(arr, target)));
    }
    static int[] search(int[][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==target){
                    return new int[] {i,j};
                }
                else if(arr[i][j]>target){
                    j--;
                }
                else{
                    i++;
                }
            }
        }
        return new int[] {-1,-1};
    }
    static int[] search1(int[][] arr,int target){
        int r=0;
        int c=arr.length-1;
        while(r<arr.length&&c>=0){
            if(arr[r][c]==target){
                return new int[] {r,c};
            }
            else if(arr[r][c]>target){
                c--;
            }else{
                r++;
            }
        }
        return new int[] {-1,-1};
    }
}
