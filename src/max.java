import java.util.Arrays;

public class max {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,7};
        System.out.println(max(arr,1,4));

    }
    static int max(int[] arr,int start,int end){

        if(arr.length==0) {
            return -1;
        }
        if(arr==null) {
            return -1;
        }
        if(end<start) {
            return -1;
        }
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
