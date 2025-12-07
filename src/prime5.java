public class prime5 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 7, 9, 11};
        int[] results = isPrime(numbers);

        for (int res : results) {
            System.out.println(res);
        }
    }

    static int[] isPrime(int[] num) {
        int[] primes = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            if (num[i] < 2) {
                primes[i] = 0; // 0 means not prime
            } else {
                primes[i] = isSinglePrime(num[i]) ? 1 : 0;
            }
        }

        return primes;
    }

    static boolean isSinglePrime(int n) {
        if (n < 2) return false;
        for (int j = 2; j * j <= n; j++) {
            if (n % j == 0) return false;
        }
        return true;
    }
}