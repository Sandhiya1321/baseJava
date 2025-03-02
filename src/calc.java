
import java.util.Scanner;
public class calc {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String operators;
        int a,b,result;
        Scanner scan=new Scanner(System.in);
        System.out.println("operator:");
        operators=scan.nextLine();
        System.out.println("enter the value a:");
        a=scan.nextInt();
        System.out.println("enter the value a:");
        b=scan.nextInt();
        switch(operators) {
            case "Add":
                result=a+b;
                System.out.println("a+b="+result);
                break;
            case "Sub":
                result=a-b;
                System.out.println("a-b="+result);
                break;
            case "mul":

                result=a*b;
                System.out.println("a*b="+result);
                break;
            case "div":
                result=a/b;
                System.out.println("a/b="+result);
                break;
            case "mod":
                result=a*b;
                System.out.println("a%b="+result);
                break;
            default:
                System.out.println("invalid operator");
                break;



        }




    }

}



