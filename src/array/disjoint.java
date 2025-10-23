package array;

public class disjoint {
    public static int check(int[] arr1,int[] arr2){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 51, 3, 43, 6};
        int[] arr2 = {80, 71, 29, 3};
        System.out.println(check(arr1,arr2));
    }
}
