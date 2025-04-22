package ArraysAndStrings;

import java.util.Arrays;

public class secondLargest {
    public static void main(String[] args) {
        int[] array = {12, 35, 1, 10, 34, 1};
        int secondLargest = findSecondLargest(array);
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Array: " + Arrays.toString(array));
            System.out.println("Second Largest Element: " + secondLargest);
        } else {
            System.out.println("Array does not have enough unique elements to find the second largest.");
        }
    }

    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}
