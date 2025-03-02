public class swap1 {
    public static void main(String[] args) {
        int arr[]={1, 4, 78, 9, 6};
        int n = arr.length;
        for(int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        for(int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}

