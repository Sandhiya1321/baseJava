package ArraysAndStrings;

public class twoDigit {

        public static void main(String[] args) {

            int[] array = {1, 23, 456, 78, 9, 34, 105, 67, 12};

            System.out.println("Two-digit numbers in the array:");
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= 10 && array[i] <= 99) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }

