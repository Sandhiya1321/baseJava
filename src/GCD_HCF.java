public class GCD_HCF {
    public static void main(String[] args) {
        //min num multiply both a and b
        int a=4;
        int b=9;
        System.out.println(gcd(a,b));
    }
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}
