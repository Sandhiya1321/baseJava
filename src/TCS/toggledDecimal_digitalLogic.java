package TCS;

import java.util.Scanner;

public class toggledDecimal_digitalLogic {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        StringBuilder binary=new StringBuilder();
        while(num>0){
            binary.insert(0,num%2);
            num/=2;
        }
        for (int i = 0; i < binary.length(); i++) {
            binary.setCharAt(i, binary.charAt(i) == '0' ? '1' : '0');
        }
        int toggle = Integer.parseInt(binary.toString(), 2);
        System.out.println(toggle);
    }
}
