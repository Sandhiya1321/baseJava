package array;

public class besttimeToBuyAndSell {
    public static int maxProfit(int[] prices) {
        if(prices==null||prices.length==0)
            return 0;
        int profit=0;
        int buy=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<=buy){
                buy=prices[i];
                continue;
            }
            profit=Math.max(profit,prices[i]-buy);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
