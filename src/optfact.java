import java.util.ArrayList;

public class optfact {
    public static void main(String[] args) {
        fact(30);
        fact1(30);
    }
    static void fact(int n){
        for (int i = 1; i <Math.sqrt(n); i++) {
            if(n%i==0){
                if(n%i==i) {
                    System.out.print(i+" ");
                }else {
                    System.out.println(i + " " + n / i+" ");
                }
            }
        }
    }
    //time and space complexity=O(sqrt(n))
    static void fact1(int n){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i <Math.sqrt(n); i++) {
            if(n%i==0){
                if(n%i==i) {
                    System.out.print(i+" ");
                }else {
                    System.out.println(i + " " );
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.println(list.get(i)+" ");
        }
    }
}
