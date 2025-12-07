package Bitwise;

public class xorRange {
    public static void main(String[] args) {
        int a=3;
        int b=9;
        int ans=xor(b)^xor(a-1);
        System.out.println(ans);

        int ans2=0;
        for (int i =a;i<=b; i++) {
            ans2^=i;
        }
        System.out.println(ans2);
    }
    static int xor(int x){
        if(x%4==0){
            return x;
        }
        if(x%4==1){
            return 1;
        }
        if(x%4==2){
            return x+1;
        }
            return 0;
    }
}
