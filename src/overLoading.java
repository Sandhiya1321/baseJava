import java.util.Arrays;

public class overLoading {
    public static void main(String[] args) {
int a;
int b;
        sum(10,20);
        dis(90);
        dis();
        dis(10,30);
        name("sandhiya");
        System.out.println(arr(10,50));

    }
    static void sum(int a,int b){
        System.out.println(a+b);
    }
    static void name(String Name){
        System.out.println(Name);
    }
    static int arr(int a,int b){

        int num=a+b;
        return num;
    }
    static void dis(int ...a){
        System.out.println(Arrays.toString(a));
    }
    static void dis(int a){
        System.out.println(a);
    }
    static void dis(int a,int b){
        System.out.println(a+" ,"+" "+b);
    }
}
