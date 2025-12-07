package TCS;

import java.util.Scanner;

public class priime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();

        int prime = nthPrime(m);
        int digitSum = singleDigitSum(prime);
        int result = prime * digitSum;

        System.out.println(result);
        scan.close();
    }

    static int singleDigitSum(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    static int nthPrime(int m) {
        int count = 0, num = 2;
        while (count < m) {
            if (isPrime(num)) {
                count++;
                if (count == m) return num;
            }
            num++;
        }
        return -1;
    }

    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}