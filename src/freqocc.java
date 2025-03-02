import java.util.Scanner;

public class freqocc {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=scan.nextInt();
        System.out.println("enter the digit:");
        int givendigit=scan.nextInt();

        int count=0;
        int temp=num;

        while(temp>0) {

            int  digit=temp%10;
            if(givendigit==digit) {
                count++;
            }
            temp=temp/10;

        }

        System.out.println("the given digit "+ givendigit+ " occured  "+ count);

    }

}
