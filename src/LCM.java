public class LCM {
    //min num that divided by both a and b
    //(3,7)=21
    public static void main(String[] args) {
        System.out.println(LCm(9,18));
    }
    static int LCm(int a,int b){
        return a*b/ GCD_HCF.gcd(a,b);
    }
}