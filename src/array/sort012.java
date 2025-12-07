package array;

import java.util.Arrays;

public class sort012 {
    public static void sortColors(int[] nums) {
        int n=nums.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1,0,0,1,2,0,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
