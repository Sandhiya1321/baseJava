package array;

import java.util.Arrays;

public class longestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr={1, 9, 3, 10, 4, 20, 2};
        System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        Arrays.sort(nums);
        int max=0;
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }else if(nums[i]==(nums[i-1]+1)){
                count++;
            }else{
                count=1;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
