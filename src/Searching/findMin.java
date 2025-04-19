package Searching;

public class findMin {
    public static void main(String[] args) {
        int[] nums={12,34,56,765,96,898};
        System.out.println(min(nums));
    }
    static int min(int[] nums){
        int ans=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<ans){
                ans=nums[i];
            }
        }
        return ans;
    }
}
