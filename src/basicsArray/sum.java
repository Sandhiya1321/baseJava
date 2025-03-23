package basicsArray;

public class sum {
    public static void main(String[] args) {
        int[] arr={1,23,45,67,89};
        System.out.println(add(arr));

    }
    public static int add(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}
