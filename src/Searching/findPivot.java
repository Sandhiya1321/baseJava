package Searching;

public class findPivot {
    public static void main(String[] args) {
        int[] arr={1,2,34,234,1200,98,45,21,11};
        System.out.println(search(arr));
    }
    //largest element
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
            if(nums[mid]<=nums[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
