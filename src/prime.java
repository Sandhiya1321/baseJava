public class prime {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 2; i <= n; i++) {
            if (isPrime(n)) {
                System.out.println(i + " is a prime number");
            }
        }
    }
    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}