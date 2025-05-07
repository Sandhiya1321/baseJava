package Searching;

public class rotationCount {
    public static void main(String[] args) {
        int[] num = {4,5,6,7,0,1,2};
        int[] nums={1,2,3,4,5,6};
        System.out.println(count(nums));
        System.out.println(count(num));
    }
    //count is the number  of elements at  the pivot sorted array
    static int count(int[] arr){
        int Pivot=pivot(arr);
        if(Pivot==-1){
          //  array is not rotated
            return 0;
        }
        return Pivot+1;
    }
    //use this for duplicates
    public static int searchDup(int[] nums) {
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
    //use this for non duplicates
    public static int pivot(int[] nums) {
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
