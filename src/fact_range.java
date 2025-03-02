public class fact_range {
    public static void main(String[]args) {
        for(int i=10;i<=20;i++) {
            System.out.println("factorial of "+i+"is "+factorial(i));
        }}

    public static long factorial(int n) {
        long fact=1;
        for(int i=1;i<=n;i++) {
            fact=fact*i;
        }
        return fact;

    }}

