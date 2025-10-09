package prepInsta;

import java.util.Scanner;

public class areaCircle {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int radius=scan.nextInt();
        double area=  (3.14*radius*radius);
        System.out.println(area);

    }
}
