import java.util.Scanner;

public class perfectSqrt {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();

        int ans= (int) Math.sqrt(num);
        if(ans*ans==num){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
