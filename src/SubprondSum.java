import java.util.Scanner;

public class SubprondSum {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=scan.nextInt();

        int sub=prod(num)-sum(num);
        System.out.println(sub);
    }
    public static int sum(int a){
        int sum=0;
        while(a!=0){
            int digits=a%10;
            sum=sum+digits;
            a=a/10;
        }
        return sum;
    }
    public static int prod(int a){
        int pro=1;
        while(a!=0) {
            int digit = a % 10;
            pro = pro * digit;
            a=a/10;
        }
        return pro;
    }

}
