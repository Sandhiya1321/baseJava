package TCS;
import java.util.Scanner;
public class candy {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        final int N=10;
        final int k=5;
        int M=N;

            int x=scan.nextInt();
            if(x<=0||x>M){
                System.out.println("INVALID INPUT");
            }
            else{
                M-=x;
                System.out.println("Number of candies sold:"+x);
            }
            if(M<k){
                M=N;
                System.out.println("Jar Refilled");
            }
            System.out.println("Number of candies left:"+M);
            System.out.println();


    }
}
