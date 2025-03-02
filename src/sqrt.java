import java.util.Scanner;

public class sqrt {


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan= new Scanner(System.in);
        System.out.println("enter the number:");
        double number=scan.nextDouble();

        double squareroot=Math.sqrt(number);
        System.out.println(squareroot);

    }

}
