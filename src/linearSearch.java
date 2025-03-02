public class linearSearch {
    public static int linear(int a[],int target){
        for (int i = 0; i <a.length ; i++) {
            if(a[i]==target){
                System.out.println("target found  "+i);
                return a[i];
            }
        }
        System.out.println("not found");
        return -1;
    }
    public static void main(String[]args){
        int a[]={11,15,13,14,10};
        System.out.println(linear(a,13));
    }

}
