import java.util.Scanner;

public class petersonNumb {
    public static int factorial(int n) {
        int fact=1;
        for(int i=1;i<=n;i++) {
            fact=fact*i;
        }
        return fact;
    }
    public static boolean isPeterson(int num) {
        int temp=num;
        int sum=0;
        while(temp>0) {
            int digit=temp%10;
            sum+=factorial(digit);
            temp=temp/10;
        }
        return sum==num;

    }



    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=scan.nextInt();

        if(isPeterson(num)) {
            System.out.println(num+"  is peterson number");
        }
        else {
            System.out.println(num+ "  not a peterson number");
        }
    }

}
