package Arrays;

import java.util.Arrays;

public class rotByCircularRot {
    public static void swap(int[] arr,int start,int end){
        start=0;
        end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void right(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        swap(arr,0,n-1);
        swap(arr,0,k-1);
        swap(arr,k,n-1);
    }
    public static void left(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        swap(arr,0,k-1);
        swap(arr,k,n-1);
        swap(arr,0,n-1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        right(array,k);
        System.out.println(Arrays.toString(array));
        left(array,k);
        System.out.println(Arrays.toString(array));
    }
}
