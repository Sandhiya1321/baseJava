package array;

public class equilibriumSum {
    public static int sumeq(int[] arr){
        int leftSum=0;
        int summ=0;
        for (int i=0;i<arr.length;i++) summ += arr[i];

        for (int i=0;i<arr.length;i++) {
            summ -= arr[i];

            if (leftSum == summ) {
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,1,3,2,4 };
        System.out.println(sumeq(arr));
    }
}
