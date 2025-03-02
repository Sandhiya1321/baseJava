import java.util.Scanner;

public class functions2 {


    public static int power(int a,int expo) {
        int res=1;
        for(int i=1;i<=expo;i++) {
            res=res*i;
        }
        return res;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the a:");
        int a=scan.nextInt();
        System.out.println("enter the expo:");
        int expo=scan.nextInt();
        int res=(int) Math.pow(a,expo);
        System.out.print(res);

    }

}


