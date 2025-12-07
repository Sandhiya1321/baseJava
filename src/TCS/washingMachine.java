package TCS;

import java.util.Scanner;

public class washingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int weight = scan.nextInt();
        if (weight < 0 || weight > 7000) {
            System.out.println("INVALID INPUT");
        }
        if (weight > 0 && weight <= 2000) {
        System.out.println("Time Estimated: 25 minutes");
        }
        else if (weight >= 2001 && weight <= 4000) {
            System.out.println("Time Estimated: 35 minutes");
        }
        if (weight == 0) {
            System.out.println("Time Estimated: 0 minutes");
        }
        else if (weight > 4000 && weight <= 7000) {
            System.out.println("Time Estimated: 45 minutes");
        }
        else {
            System.out.println("OVERLOADED");
        }
    }
}