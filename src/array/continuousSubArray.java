package array;

public class continuousSubArray {
    public static long contArray(int[] nums) {
        int n = nums.length;
        long count = 0;
        int left = 0;

        // Track min and max in the current window
        int min = nums[0], max = nums[0];

        for (int i = 0; i < n; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);

            // Shrink window if invalid
            while (max - min > 2) {
                left++;
                // recompute min and max in the new window
                min = nums[left];
                max = nums[left];
                for (int k = left; k <= i; k++) {
                    min = Math.min(min, nums[k]);
                    max = Math.max(max, nums[k]);
                }
            }

            // Count valid subarrays ending at i
            count += (i - left + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr={1,2,4,3,2,5};
        System.out.println(contArray(arr));
    }
}
