import java.util.Scanner;

public class simpleIntrest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the Principal:");
        int principal=scan.nextInt();
        System.out.println("enter the Time:");
        int time=scan.nextInt();
        System.out.println("enter the Rate:");
        double rate=scan.nextDouble();

        System.out.println(simpleInt(principal,time,rate));

    }
    public static double simpleInt(int principal,int time,double rate){
      double simpleInterst=(principal*rate*time)/100;
      return simpleInterst;
    }
}
