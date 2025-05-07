package Searching;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,5,47};
        System.out.println(binary(arr,47));
    }
    static int binary(int[] arr,int target){
        int start=0;
        int end=arr.length;
        while(start<=end) {
            int mid = start + (end - start) / 2;
             if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (arr[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
}