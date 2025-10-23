package array;

public class largeSumContagiousSubarrayKadanesAlgm {
    public static int largeSum(int[] arr){
        int maxS=arr[0];
        int maxE=arr[0];
        for(int i=1;i<arr.length;i++){
            maxE=Math.max(maxE+arr[i],arr[i]);
            maxS=Math.max(maxE,maxS);
        }
        return maxS;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(largeSum(arr));
    }
}
