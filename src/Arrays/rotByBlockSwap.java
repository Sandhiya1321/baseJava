package Arrays;

import java.util.Arrays;

//rotate an array by block swap algorithm
public class rotByBlockSwap {
  public static void swap(int[] arr,int n,int f,int s){
      for (int i = 0; i < n; i++) {
          int temp=arr[f+i];
          arr[f+i]=arr[s+i];
          arr[s+i]=temp;
      }
  }
  public static void rotate(int[] arr,int i,int d,int n){
      if(d==0||d==n) return;
      if(d==n-1){
          swap(arr,i,n-d+i,d);
      }else if(d<n-d){
          swap(arr,i,n-d+i,d);
          rotate(arr,i,d,n-d);
      }else{
          swap(arr,i,n-d+i,d);
          rotate(arr,n-d+i,2*d-n,d);
      }
  }
  public static void leftRotate(int[] arr,int d){
      int n=arr.length;
      if(d==0||d==n) return;
      rotate(arr,0,d,n);
  }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int d = 2;
        leftRotate(arr, d);
        System.out.println(Arrays.toString(arr));
    }
}
