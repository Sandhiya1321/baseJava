package ArraysAndStrings;

import java.util.Scanner;

public class avgArray {
    public static void main(String[] args) {
        int[] array = {12, 34, 5, 67, 1, 89, 23};
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;
        System.out.printf("The average of the array elements is: %.2f%n", average);


    }
}
