package Arrays;


public class secondLargest {
    public static void main(String[] args) {
        int[] array = {12, 35, 1, 10, 34, 1};
        int secondLargest = findSecondLargest(array);
        System.out.println(secondLargest);
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
