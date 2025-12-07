package array;

import java.util.Arrays;

public class rearrangePosToNeg {
    public static void main(String[] args) {
        int[] arr = {-1, 6, -2, 3, -4, 9};
        ans(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int left,int right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
    }
    public static void ans(int[] arr) {
        int pos = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (pos >= 0) {
                if ((arr[pos] >= 0 && arr[i] < 0) || (arr[pos] < 0 && arr[i] >= 0)) {
                    rotate(arr, pos, i);
                    if (i - pos >= 2) pos += 2;
                    else pos = -1;
                }
            }
            
            if(pos==-1){
                if((arr[i]>=0&&i%2==1)||(arr[i]<0&&i%2==0)){
                    pos=i;
                }
            }
        }
    }
    public static void rotate(int[] arr, int pos,int cur){
        int temp=arr[cur];
        for(int i=cur;i>pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=temp;
    }
}
