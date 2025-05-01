public class prime1  {
    public static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 11;
        System.out.println(num + (isPrime(num) ? " is a prime number" : " is not a prime number"));
    }
}