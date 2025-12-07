package array;

public class smallSubArrayGreaterThanValue {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 19};
        int sum = 51;
        System.out.println(smallArray(arr,sum));
    }
    public static int smallArray(int[] arr,int k){
        int min=arr.length+1;
        for (int i = 0; i < arr.length; i++) {
            int cur=arr[i];
            if(cur>k) return 1;
            for (int j = i+1; j < arr.length; j++) {
                cur+=arr[j];
                if(cur>k && (j-i+1)<arr.length){
                    min=j-i;
                }
            }
        }
        return min;
    }
}
