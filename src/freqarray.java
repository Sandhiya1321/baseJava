import java.util.Arrays;
public class freqarray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1,1, 4, 5, 6};//1,1,1,2,4,5,6
        Arrays.sort(arr);
        int n = arr.length;
        System.out.println("element  |    frequency");
        for (int i = 0; i < n; ) {
            int count = 1;
            while (i + count < n && arr[i] == arr[i + count]) {
                count++;
            }
            System.out.println(arr[i] + "        |       " + count);

            i += count;
        }
    }
}