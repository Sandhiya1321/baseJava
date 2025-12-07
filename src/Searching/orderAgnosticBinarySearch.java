package Searching;
//ascending order
public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] nums={12,34,56,96,765,898};
        int[] num={898,765,96,56,34,12};
        int target=96;
        System.out.println(search(nums,target));
        System.out.println(search(num,target));

    }
    static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean ass=arr[start]<arr[end];

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(ass){
                if(target<arr[mid]){
                  end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
