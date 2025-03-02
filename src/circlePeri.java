import java.util.Scanner;

public class circlePeri {

    public static double calperi(int radius) {

        double perimeter=2*Math.PI*radius;
        return perimeter;
    }

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the radius:");
        int radius=scan.nextInt();


        System.out.println(calperi(radius));
    }



}


