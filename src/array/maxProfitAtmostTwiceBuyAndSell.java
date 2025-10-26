package array;

import java.util.Arrays;

public class maxProfitAtmostTwiceBuyAndSell {
    public static void main(String[] args) {
        int[] arr= {2, 30, 1, 10, 8, 25, 80};
        System.out.println(maxProfit(arr));
    }
//    public static int maxProfit(int[] arr){
//        int n=arr.length-1;
//        int max=0;
//        Arrays.sort(arr);
//        for (int i = 0; i <2; i++) {
//
//            int buy=arr[i];
//            int sell=arr[n-i];
//            int profit=sell-buy;
//            max+=profit;
//        }
//        return max;
//    }
    public static int maxProfit(int[] arr){
        int buy1 = Integer.MIN_VALUE;
        int buy2=Integer.MIN_VALUE;
        int sell1=0;
        int sell2=0;
        for(int num:arr){
            buy1=Math.max(buy1,-num);
            sell1=Math.max(sell1,buy1+num);
            buy2=Math.max(buy2,sell1-num);
            sell2=Math.max(sell2,buy2+num);
        }
        return sell2;
    }
}
