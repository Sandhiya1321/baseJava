package ArraysAndStrings;

public class threeDigit {

        public static void main(String[] args) {
            int[] array = {1, 23, 456, 789, 89, 105, 67, 123, 1000};

            System.out.println("Three-digit numbers in the array:");
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= 100 && array[i] <= 999) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
