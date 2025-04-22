package ArraysAndStrings;

import java.util.Arrays;

public class minMax {
    public static void main(String[] args) {

        int[] array = {12, 34, 5, 67, 1, 89, 23};
        int min = findMin(array);
        int max = findMax(array);
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Minimum Value: " + min);
        System.out.println("Maximum Value: " + max);
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
