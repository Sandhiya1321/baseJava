package sorting;

import java.util.ArrayList;
import java.util.List;

public class findAlldup {
    public static void main(String[] args) {
        int[] arr={1,3,3,4,2,2};
        System.out.println(sort(arr));
    }
    static List<Integer> sort(int[] arr){
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
        List<Integer> ans=new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans.add(arr[j]);
            }
        }
        return ans;
    }
    static void swap(int[] arr,int start,int second){
        int temp=arr[start];
        arr[start]=arr[second];
        arr[second]=temp;
    }
}
