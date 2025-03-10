import java.util.Scanner;

public class greet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("enter the name:");
            String name = scan.next();
            if(name.equalsIgnoreCase("sandy")){
                System.out.println("hiii  "+name);

            }
            else if(name.equalsIgnoreCase("shal")){
                System.out.println("hello  "+name);

            }
            else{
                System.out.println("invalid");
                break;
            }

        }

    }
}
