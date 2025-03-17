import java.util.Scanner;

public class large {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int num,largest=Integer.MIN_VALUE;
        do{
            System.out.println("enter the num: ");
             num=scan.nextInt();
            if(num!=0&&num>largest){
                largest=num;
            }
        }
        while(num!=0);
            System.out.println("largest number entered is "+largest);

    }
}
