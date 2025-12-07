package array;

public class unionIntersection {
    public static void union(int[] arr1,int[] arr2){
        int i=0,j=0;
        while (  i < arr1.length&&j<arr2.length) {
            if(arr1[i]<arr2[j]) {
                System.out.println(arr1[i]);
                i++;
            }
            else if(arr1[i]>arr2[j]) {
                System.out.println(arr2[j]);
                j++;
            }else{
                System.out.println(arr2[j]);
                i++;
                j++;
            }
        }
        while(i<arr1.length){
            System.out.println(arr1[i]);
            i++;
        }
        while(j<arr2.length){
            System.out.println(arr2[j]);
            j++;
        }
        System.out.println();
    }
    public static void intersection(int[] arr1,int[] arr2){
        int i=0,j=0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            }else if(arr1[i]>arr2[j]){
                j++;
            }else{
                System.out.println("Intersection :"+arr1[i]);
                i++;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = { 1,2,3};
        int[] arr2 = {2,4,5,6,7};
        union(arr1,arr2);
        intersection(arr1,arr2);
    }
}
