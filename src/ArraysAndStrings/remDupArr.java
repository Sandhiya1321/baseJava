package ArraysAndStrings;

import java.util.Arrays;

public class remDupArr {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 2, 3, 5, 6, 5};
        int[] uniqueArray = removeDuplicates(array);
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Array without Duplicates: " + Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        int[] temp = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (array[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[index++] = array[i];
            }
        }
        int[] result = Arrays.copyOf(temp, index);
        return result;
    }
}
