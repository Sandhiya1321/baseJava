import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the num");
        int num=scan.nextInt();

        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println("the factors of num are: "+i+" ");
            }
        }

    }
}
