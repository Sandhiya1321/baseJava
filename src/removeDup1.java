import java.util.Arrays;

public class removeDup1 {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,5,4,5,6,7};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!=arr[i+1]){
                continue;
            }
            System.out.println(arr[i]);
        }
        System.out.println(arr[arr.length-1]);
    }
}
