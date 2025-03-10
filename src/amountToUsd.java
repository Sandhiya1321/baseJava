import java.util.Scanner;

public class amountToUsd {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the amount:  ");
        double amount=scan.nextDouble();
        System.out.println("enter the currency code: ");
        String code=scan.next();
        double amt=currencyCode(code);
        System.out.println(amount +"  "+code+ "  is equal to "+amt+" USD");

    }
    public static double currencyCode(String code){
        if(code.equalsIgnoreCase("INR")){
            return 0.012;
        } else if (code.equalsIgnoreCase("EUR")) {
            return 1.108;
        }
        else{
            return 1.0;
        }
    }
}
