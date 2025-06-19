package sorting;

import java.util.Arrays;

//41
public class findMissingPositive {
    public static void main(String[] args) {
        int[] arr={1,3,5,4};
        System.out.println(sort(arr));

    }
    static int sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]>0&&arr[i]<=arr.length&&arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                return j+1;
            }
        }
        return arr.length+1;

    }
    static void swap(int[] arr,int start,int second){
        int temp=arr[start];
        arr[start]=arr[second];
        arr[second]=temp;
    }
}
