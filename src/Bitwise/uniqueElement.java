package Bitwise;

public class uniqueElement {
    public static void main(String[] args) {
        int[] nums={2,3,2,1,5,1,3,4,4};
        System.out.println(unique(nums));

    }

    private static int unique(int[] nums) {
        int ans=0;
        for (int n:nums){
            ans^=n;
        }
        return ans;
    }
}
