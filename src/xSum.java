import java.util.Scanner;

public class xSum {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int total=0;
        while(true){
            System.out.println("enter the number:");
            String n=scan.next();
            if(n.equalsIgnoreCase("x")){
                break;
            }
            else{
                total=total+Integer.parseInt(n);
            }
        }
        System.out.println(total);
    }
}
