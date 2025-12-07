package sorting;



//268(amazon questions)
public class missingNumber {
    public static void main(String[] args) {
        int[] arr={3,4,2,0};
        System.out.println(missing(arr));
    }
    static int missing(int[] arr){
        int i=0;
        while(i< arr.length) {
            int correct = arr[i];
            if(arr[i]<arr.length&&arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                return index;
            }
        }
        return arr.length;
    }
static void swap(int[] arr,int start,int second){
        int temp=arr[start];
        arr[start]=arr[second];
        arr[second]=temp;
}
}
