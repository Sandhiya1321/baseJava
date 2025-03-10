import java.util.Scanner;

public class armBtTwoNum {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the upperlimit:" );
        int upperlimit=scan.nextInt();
        System.out.println("enter the lowerlimit:" );
        int lowerlimit=scan.nextInt();
        for (int i = upperlimit; i <lowerlimit ; i++) {


            if (armstrong(i)) {
                System.out.println(i + "  is armstrong number");
            }
        }
    }
    public static boolean armstrong(int a){
        int temp=a;
        int count=0;
        int sum=0;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        int b=a;
        while(b!=0){
           int digit=b%10;
            sum= (int) (sum+Math.pow(digit,count));
            b=b/10;

        }
        return a==sum;
    }
}
