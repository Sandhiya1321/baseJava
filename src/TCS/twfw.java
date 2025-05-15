package TCS;

import java.util.Scanner;

public class twfw {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int totVeh=scan.nextInt();
        int totWheels=scan.nextInt();

        if(totWheels<2||totWheels%2!=0||totVeh>=totWheels){
            System.out.println("INVALID INPUT");
            return;
        }
        int tw=(totWheels-4*totVeh)/-2;
        int fw=totVeh-tw;

        if(tw<0||fw<0){
            System.out.println("INVALID INPUT");
        }
        else{
            System.out.println("TW="+tw+"FW="+fw);
        }
    }
}
