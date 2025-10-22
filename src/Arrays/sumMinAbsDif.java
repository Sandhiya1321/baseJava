package Arrays;

public class sumMinAbsDif {
    public static void main(String[] args) {
        //find the sum of absolute answer of the array difference
        int res = Integer.MAX_VALUE;
        int[] arr = {2, 4, 5, 3};
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for(int j=0;j<arr.length;j++){
                sum+=Math.abs(arr[i]-arr[j]);
            }
            res=Math.min(res,sum);
        }
        System.out.println(res);
    }
}
