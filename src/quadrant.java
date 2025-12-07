import java.util.Scanner;

public class quadrant {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int y=scan.nextInt();

        if(x>0&&y>0){
            System.out.println("Quadrant I");
        }else if(x<0&&y<0){
            System.out.println("Quadrant III");
        }else if(x<0&&y>0){
            System.out.println("Quadrant II");
        }else if(x>0&&y<0){
            System.out.println("Quadrant IV");
        }else if(x==0&&y==0){
            System.out.println("origin");
        }else if(x==0&&y!=0){
            System.out.println("y axis");
        }else if(x!=0&&y==0){
            System.out.println("x axis");
        }
    }
}
