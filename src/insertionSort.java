import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] res=insertion(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] insertion(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
        return arr;
    }
    public static void swap(int[] arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
