package twoD;

import java.util.Arrays;

//time complexity-O(log(n)+log(m))
public class sortedMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
        int target=12;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] binarySearch(int[][] arr,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(arr[row][mid]==target){
                return new int[] {row,mid};
            }
            if(arr[row][mid]>target){
                cStart=mid+1;
            }
            else{
               cEnd=mid-1;
            }
        }
        return new int[] {-1,-1};
    }
    static int[] search(int[][] arr,int target){
        int rows=arr.length;
        int colm=arr[0].length;
        if(rows==1){
            return binarySearch(arr,0,0,colm-1,target);
        }
        int rStart=0;
        int rEnd=rows-1;
        int mid=colm/2;
        while(rStart<rEnd-1){
            int mid1=rStart+(rEnd-rStart)/2;
            if(arr[mid1][mid]==target){
                return new int[] {mid1,mid};
            }
            if(arr[mid1][mid]<target){
                rStart=mid1;
            }
            else{
                rEnd=mid;
            }

        }
        //we have two rows
        //check whether the target is in col of 2 rows
        if(arr[rStart][mid]==target){
            return new int[] {rStart,mid};
        }
        if(arr[rStart+1][mid]==target){
            return new int[] {rStart+1,mid};
        }
        //search in 1st half,
        if(target<=arr[rStart][mid-1]){
            return binarySearch(arr,rStart,0,mid-1,target);
        }
        // 2nd half,
        if(target>=arr[rStart][mid+1]&&target<=arr[rStart][colm-1]){
            return binarySearch(arr,rStart,mid+1,colm-1,target);
        }
        // 3rd half,
        if(target<=arr[rStart+1][mid-1]){
            return binarySearch(arr,rStart+1,0,mid-1,target);
        }
        // 4th half
       else{
            return binarySearch(arr,rStart+1,mid+1,colm-1,target);
        }
    }
}
