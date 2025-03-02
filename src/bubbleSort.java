import java.util.Arrays;

public class bubbleSort {
    public static int[] bubble_On(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }

        return arr;
    }

    public static void main(String[] args) {
        int a[]={6,87,45,13,2};
        int[] res=bubble_On(a);
        System.out.println(Arrays.toString(res));

    }
}

