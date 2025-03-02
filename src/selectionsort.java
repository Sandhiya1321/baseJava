import java.util.Arrays;
public class selectionsort {
    public static int[] selection(int a[]){
        for (int i = 0; i < a.length-1; i++) {
            int last=a.length-1-i;
            int max=greatest(a,last);
            int temp=a[max];
            a[max]=a[last];
            a[last]=temp;
        }
        return a;
    }
    public static int greatest(int arr[],int last){
        int max=0;
        for (int i = 0; i <=last; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={12,14,11,34,29,0};
        System.out.println(Arrays.toString(selection(arr)));
    }
}
