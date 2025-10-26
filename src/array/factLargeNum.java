package array;

import java.math.BigInteger;

public class factLargeNum {
    public static long fact(int n){
        long ans=1;
        for(int i=2;i<=n;i++){
           ans*=i;
        }
        return ans;
    }

    public static BigInteger fact1(int n){
        BigInteger ans= BigInteger.ONE;
        for(int i=2;i<=n;i++){
            ans=ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=25;
        System.out.println(fact(n));
        System.out.println(fact(35));
    }
}
