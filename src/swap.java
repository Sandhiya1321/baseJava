public class swap {
    public static void main(String[]args) {
        int a=10;
        int b=80;
        System.out.println("before swapping:a= "+a+"and b= "+b);
        a=a+b;  //10+80=90
        b=a-b;  //90-80=10
        a=a-b;  //90-10=80
        System.out.println("after swapping:a= "+a+"and b= "+b);
    }
}