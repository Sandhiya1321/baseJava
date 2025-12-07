package array;

public class maxProd {
    public static int max(int[] arr){
        int res=arr[0];
        for(int i=0;i<arr.length;i++){
            int mul=arr[i];
            for(int j=i+1;j<arr.length;j++){
                mul*=arr[j];
            }
            res=Math.max(res,mul);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={10, -20, -30, 0, 70, -80, -20};
        System.out.println(max(arr));
    }
}
