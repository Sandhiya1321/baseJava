package Number_system;

public class goodint {
    public static void main(String[] args) {
        int n=4;
        System.out.println(good(n));
    }
    public static boolean good(int x){
        return (x & (x - 1)) != 0;
    }
}
