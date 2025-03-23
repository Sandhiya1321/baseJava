package basicsArray;

public class maxMin {
    public static void main(String[] args) {
        int[] arr={23,5,67,87,89};
        System.out.println("maximum value : " +max(arr)+" "+"Minimum value: "+min(arr));


    }
    public static  int max(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
               max=arr[i];
            }
        }
        return max;
    }
    public static int min(int[] arr){
        int min=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
