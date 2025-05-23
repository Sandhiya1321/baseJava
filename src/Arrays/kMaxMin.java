package Arrays;

import java.util.Arrays;

public class kMaxMin {
    public static void main(String[] args) {
        int[] arr={1, 23, 12, 9, 30, 2, 50};
        int k=4;
        Arrays.sort(arr);//1,2,9,12,23,30,50
        System.out.println(arr[k-1]);
        int n=arr.length;
        for (int i = 0; i < n/2; i++) {
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }//50,30,23,12,9,2,1
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n; i++) {
            if(i==k-1){
                System.out.println(arr[i]);
            }
        }
    }
}