package array;

public class countInversion {
    //count how far  the element is  away

    public static int count(int[] arr){
        int countIn=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    countIn++;
                }
            }
        }
        return countIn;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 5};
        System.out.println(count(arr));
    }
}
