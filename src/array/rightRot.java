package array;

import java.util.Arrays;

public class rightRot {
    public static void right(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        int[] temp=new int[k];
        for (int i = 0; i < k; i++) {
            temp[i]=arr[n-k+i];
        }
        for (int i = n-k-1; i >= 0; i--) {
            arr[i+k]=arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr[i]=temp[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70};
        int n = arr.length;
        int k = 3;
        right(arr,k);
        System.out.println(Arrays.toString(arr));
    }
}
