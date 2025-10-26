package array;

import java.util.Arrays;

public class nextPermute {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void nextPermutation(int[] nums) {
        int n=nums.length;

        int i=n-2;
        while(i>=0&&nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
    }
    public static void swap(int[] nums,int start,int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
    public static void reverse(int[] nums,int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}
