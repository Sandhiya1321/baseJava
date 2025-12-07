package TCS;

import java.util.Scanner;

public class fitnessTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] t1 = new int[3], t2 = new int[3], t3 = new int[3];
        int[] avg = new int[3];
        int maxOxy = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            t1[i] = scan.nextInt();
            t2[i] = scan.nextInt();
            t3[i] = scan.nextInt();
        }

        avg[0] = Math.round((t1[0] + t1[1] + t1[2]) / 3.0f);
        avg[1] = Math.round((t2[0] + t2[1] + t2[2]) / 3.0f);
        avg[2] = Math.round((t3[0] + t3[1] + t3[2]) / 3.0f);

        for (int oxygen : avg) {
            if (oxygen > maxOxy) {
                maxOxy = oxygen;
            }
        }

        if (maxOxy < 70) {
            System.out.println("All trainees are unfit.");
        } else {
            for (int i = 0; i < 3; i++) {
                if (avg[i] == maxOxy) {
                    System.out.println("Trainee Number : " + (i + 1));
                }
            }
            System.out.println("Highest Average Oxygen Level: " + maxOxy);
        }
    }
}