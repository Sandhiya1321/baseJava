public class peak {
    public static void main(String[] args) {
        int arr[] = {12,100, 5, 34, 25, 6};
        int n=6;
        for (int i = 1; i <=n-2; i++) {
            int mis=0;
            if(arr[i-1]<arr[i]&&arr[i]>arr[i+1]){

                mis=1;
            }
            if(mis==1){
                System.out.println(" peak is  "+i);
            }


        }
    }
}