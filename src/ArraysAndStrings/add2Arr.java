package ArraysAndStrings;

import java.util.Arrays;

public class add2Arr {
        public static void main(String[] args) {
            int[] array1 = {1, 2, 3, 4, 5};
            int[] array2 = {6, 7, 8, 9, 10};
            int[] resultArray = new int[array1.length];
            for (int i = 0; i < array1.length; i++) {
                resultArray[i] = array1[i] + array2[i];
            }
            System.out.println("Resulting Array: " + Arrays.toString(resultArray));
        }
    }

