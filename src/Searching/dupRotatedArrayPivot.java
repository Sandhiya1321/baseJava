package Searching;

public class dupRotatedArrayPivot {
    public static void main(String[] args) {
        int[] nums = {3,1,4,5,6,7,0,1,2,2,1};
        System.out.println(search(nums));
    }
    public static int search(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start&&nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[mid]==nums[start]&&nums[mid]==nums[end]){
                //check if start is pivot
                if(nums[start]>nums[start+1]){
                    return start;
                }
                start++;
                //check whether end is pivot
                if(nums[end]<nums[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted so pivot should
            else if(nums[start]<nums[mid]||(nums[start]==nums[mid]&&nums[mid]>nums[end])){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
