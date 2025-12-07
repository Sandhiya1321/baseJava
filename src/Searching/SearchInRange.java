package Searching;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums={12,34,56,765,96,898};
        int target=96;
        System.out.println(search(nums,target,1,4));

    }
    static int search(int[] nums,int target,int start,int end){
        if(nums.length==0){
            return -1;
        }

        for(int i=start;i<end;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
