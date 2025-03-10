import java.util.Scanner;

public class arithmeticOp {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a");
        int a=scan.nextInt();
        System.out.println("enter b");
        int b=scan.nextInt();
        System.out.println("enter operator");
       char operator=scan.next().charAt(0);

        if(operator=='+'){
            int c= a+b;
            System.out.println(c);
        }
        else if(operator=='-'){
            int d=a-b;
            System.out.println(d);
        }
        else if(operator=='*'){
            int e=a*b;
            System.out.println(e);
        }
        else if(operator=='/'){
            int f=a/b;
            System.out.println(f);
        }
        else{
            System.out.println("invalid operator");
        }
    }
}
