import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.print("enter the number: ");
      int m=scan.nextInt();
      System.out.print("enter the number: ");
      int n=scan.nextInt();
        System.out.println(HCFs(n,m));

    }
    public static int HCFs(int a,int b){
    if(b==0){
        return a;
    }
    else{
        return HCFs(b,a%b);
    }
    }
}