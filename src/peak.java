public class peak {
    public static void main(String[] args) {
        int nums[] = {12, 100, 5, 34, 25, 6};
        int n = nums.length;
        System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {
        int n=nums.length;

            if(n==1){
                return 0;
            }
            if(nums[0]>nums[1]){
                return 0;
            }
            if(nums[n-1]>nums[n-2]){
                return n-1;
            }
            for(int i=1;i<n-1;i++){
                if(nums[i-1]<nums[i]&&nums[i]>nums[i+1]){
                    return i;
                }
            }
        return -1;
        }
}
