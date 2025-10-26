package array;

public class pairEqualToSum {
    public static int countPair(int[] arr,int sum){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]+arr[j]==sum){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int sum = 6;
        System.out.println(countPair(arr,sum));
    }
}
