package sortingAndSearching;

import java.util.Arrays;

public class binary {
    public static int binary(int arr[],int target){
        Arrays.sort(arr);
        int l=0;
        int r=arr.length-1;

        while(l<=r){
            int mid=l+((r-l)/2);
            if(arr[mid]==target){
                System.out.println("target found at"+mid);
                return mid;
            }
            else if(arr[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }

        }
        return-1;
    }

    public static void main(String[] args) {
        int a[]={12,13,14,11,15};
        System.out.println(binary(a,14));
    }

}



