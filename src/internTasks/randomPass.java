package internTasks;

import java.util.Random;
import java.util.Scanner;

public class randomPass {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random random=new Random();
        System.out.println("Enter the password length");
        int length=scan.nextInt();
        System.out.println("Include numbers(yes/no)");
        boolean useNumbers=scan.next().equalsIgnoreCase("yes");
        System.out.println("Include useUppercase(yes/no)");
        boolean useUppercase=scan.next().equalsIgnoreCase("yes");
        System.out.println("Include useLowercase(yes/no)");
        boolean useLowercase=scan.next().equalsIgnoreCase("yes");
        System.out.println("Include useSpecialCharacter(yes/no)");
        boolean useSpecialCharacter=scan.next().equalsIgnoreCase("yes");
        StringBuffer charPool=new StringBuffer();
        if(useNumbers) charPool.append("0123456789");
        if(useUppercase) charPool.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        if(useLowercase) charPool.append("abcdefghijklmnopqrstuvwxyz");
        if(useSpecialCharacter) charPool.append("!@#$%^&*()<>:<>,.?/|");
        StringBuilder password=new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index=random.nextInt((charPool.length()));
            password.append(charPool.charAt(index));
        }
        System.out.println("Generated password: "+password.toString());


    }
}
