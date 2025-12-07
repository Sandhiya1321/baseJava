public class prime3 {
    public static void main(String[] args) {
        int n=13;
        System.out.println(isPrime(n));
        for (int i = 2; i <=n; i++) {
            System.out.println(i+" "+isPrime(i));
        }

    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int a=2;
        while(a*a <=n){
            if (n % a == 0) {

                return false;
            }
            a++;
        }
        return true;
    }
}
