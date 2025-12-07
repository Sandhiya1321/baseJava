import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun("sandy","san","samjk","345");
        fun();
        more(3,"sand",'8','h','i');
    }
    static void fun(String ...a){
        System.out.println(Arrays.toString(a));
    }
    static void more(int a,String b,char ...c){
        System.out.println(Arrays.toString(c));
        System.out.println(a);
        System.out.println(b);
    }
}
