import java.util.Scanner;

public class sumnnumbers {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=scan.nextInt();
        int count=0;
        for(int i=1;i<=n;i++) {
            count=count+i;
        }
        System.out.println(count);
    }}

