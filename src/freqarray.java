import java.util.Arrays;
public class freqarray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 4, 5, 6};
        Arrays.sort(arr);
        int n = arr.length;
        int visited=-1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[i]) {
                count++;
            }
            System.out.println("element"+"   |    "+"frequency");
            System.out.println(arr[i]+"   |   "+count);
        }
    }}