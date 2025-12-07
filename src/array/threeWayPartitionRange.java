package array;

import java.util.Arrays;

public class threeWayPartitionRange {
    public static void main(String[] args) {
        int[] arr = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
        partition(arr, 10, 20);
        for(int num:arr) {
            System.out.println(num+" ");
        }
    }
    public static void partition(int[] arr,int low,int high){
        int start=0;
        int end=arr.length-1;
        int i=0;

        while(i<=end){
            if(arr[i]<low){
                int temp=arr[i];
                arr[i]=arr[start];
                arr[start]=temp;
                i++;
                start++;
            }else if(arr[i]>high){
                int temp=arr[i];
                arr[i]=arr[end];
                arr[end]=temp;
                end--;
            }else{
                i++;
            }
        }
    }
}
