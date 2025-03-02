public class missing {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        int n=6;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }

        int sum1=0;
        for(int i=0;i<=n;i++){
            sum1=sum1+i;
        }

        int missing=sum1-sum;
        System.out.print("missing number is:"+missing);
    }


}

