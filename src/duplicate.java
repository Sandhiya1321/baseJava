public class duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 3, 2};
        int[] result = removeDuplicates(arr);

        System.out.println("Array after removing duplicates:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[index++] = arr[i];
            }
        }
        int[] result = new int[index];
        System.arraycopy(temp, 0, result, 0, index);
        return result;
    }
}