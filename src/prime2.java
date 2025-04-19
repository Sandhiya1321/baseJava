import java.util.Scanner;

public class prime2 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(prime(n));
        for(int i=100;i<1000;i++){
            if(arm(i)){
                System.out.print(i+" ");
            }
        }


    }

    static boolean arm(int a) {
        int count = 0;
        int sum = 0;
        int b = a;
        while (b > 0) {
            b = b / 10;
            count++;
        }
        int temp = a;
        while (temp > 0) {
            int num = temp % 10;
            sum = (int) (sum + Math.pow(num, count));
            temp = temp / 10;

        }
        return a == sum;
    }

    static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n % 2 == 0) {
                return false;

            }


        }
        return true;

    }

}




