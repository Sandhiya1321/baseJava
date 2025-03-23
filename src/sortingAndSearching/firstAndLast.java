package sortingAndSearching;
public class firstAndLast {
    public static int findFirst(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int firstPosition = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                firstPosition = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return firstPosition;
    }


    public static int findLast(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int lastPosition = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                lastPosition = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return lastPosition;
    }

   public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 6, 8, 8};
        int target = 4;

        int first = findFirst(arr, target);
        int last = findLast(arr, target);

        if (first != -1 && last != -1) {
            System.out.println("First Position: " + first);
            System.out.println("Last Position: " + last);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
