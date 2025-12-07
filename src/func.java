import java.util.Scanner;

public class func {
    public static void main(String[] args) {
        sum();
    }
    public static void sum(){
        Scanner scan=new Scanner(System.in);
        int a,b,c;
        System.out.print("enter a:");
        a =scan.nextInt();
        System.out.print("enter b:");
        b=scan.nextInt();
        c=a+b;
        System.out.println("the sum is: "+c);

    }
}
