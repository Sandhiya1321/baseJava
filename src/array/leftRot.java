package array;

import java.util.Arrays;

public class leftRot {
    public static void left(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        int[] temp=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=k;i<n;i++){
            arr[i-1]=arr[i];
        }
        for(int i=0;i<k;i++){
            arr[n-k+i]=temp[i];
        }

    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70};
        int n = arr.length;
        int k = 3;
        left(arr,k);
        System.out.println(Arrays.toString(arr));
    }
}
