package basicsArray;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(second(arr));

    }
    public static int second(int[] arr){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        if(arr.length<2){
            return Integer.MIN_VALUE;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>first) {
                second = first;
                first = arr[i];
            } else if (arr[i]>first&&arr[i]!=first) {
                second=arr[i];

            }
        }
       if(second==Integer.MIN_VALUE){
           System.out.println(" no second largest found");
       }
       return second;
        }


    }

