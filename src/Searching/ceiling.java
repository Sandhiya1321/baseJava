package Searching;

public class ceiling {
    /*it is same as binary search but in this if target is not found then the next greater value of
    the target value is return instead of -1
    ceiling=smallest element in the array that is greater than or equal to target*/
    public static void main(String[] args) {
        int[] arr={1,2,3,12,21,22,32,444};
        System.out.println(search(arr,43,0,arr.length-1));
    }
    static int search(int[] arr,int target,int start,int end){
        if(target<arr[arr.length-1]){
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return arr[start];
    }
}
