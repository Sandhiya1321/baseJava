package basicsArray;

import java.util.Arrays;

public class uniqueelement {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,2,5,4,5,4};
        System.out.println(unique(arr));
    }
    public static int unique(int[] arr){
        Arrays.sort(arr);
        int result = 0;
        for (int num : arr) {
            result ^= num; // XOR accumulates unique element.
        }
        return result;
}
}
