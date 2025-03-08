public class Shadowing {
    static int a=5;
    public static void main(String[] args){
        int a;
        a=10;
        System.out.println(a);
        dis();
    }

    static void dis(){

        System.out.println(a);
    }
}
