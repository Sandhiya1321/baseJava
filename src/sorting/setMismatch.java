package sorting;

import java.util.Arrays;

//645
public class setMismatch {
    public static void main(String[] args) {
        int[] arr={1,3,2,4,2};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                return new int[] {arr[j],j+1};
            }
        }
        return new int[] {-1,-1};
    }
    static void swap(int[] arr,int start,int second){
        int temp=arr[start];
        arr[start]=arr[second];
        arr[second]=temp;
    }

}