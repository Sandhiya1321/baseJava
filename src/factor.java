public class factor {
    public static void main(String[] args) {
        fact(30);
    }
    //time complexity-O(n)
    static void fact(int n){
        for (int i = 1; i <n ; i++) {
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
