import java.util.Scanner;

public class twoDarray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter s");
        int s=scan.nextInt();
        System.out.println("enter r");
        int r=scan.nextInt();
        int[][] a=new int[s][r];
        System.out.println("enter the array:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j] = scan.nextInt();
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


    }
}
