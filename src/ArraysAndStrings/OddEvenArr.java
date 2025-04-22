package ArraysAndStrings;

public class OddEvenArr {
    public static void main(String[] args) {
        int[] array = {12, 5, 7, 10, 3, 6, 8, 1, 4};

        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Count of Even Numbers: " + evenCount);
        System.out.println("Count of Odd Numbers: " + oddCount);
    }
}
