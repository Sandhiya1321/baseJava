public class removeArray{
    public static void main(String[] args) {
        int arr[]={12,13,14,15};
        int result[]=new int[arr.length];
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(i>=2){
                result[i]=arr[i+1];
            }
            else {
                result[i] = arr[i];
            }
        }
        System.out.println("after deletion");
        for(int i=0;i<n-1;i++){
            System.out.println(result[i]);
        }
    }
}

