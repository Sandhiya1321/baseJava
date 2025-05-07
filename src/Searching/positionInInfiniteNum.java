package Searching;
//amazon
//without using arr.length
//greeks for greeks
public class positionInInfiniteNum {
    public static void main(String[] args) {
        int[] arr={1,2,11,21,54,76,879,980};
        int target=54;
        System.out.println(ans(arr,target));
        
    }
    static int search(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    //to find range
    static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newStart=end+1;
            //end=previous end+size of box*2
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return search(arr,target,start,end);
    }
}
