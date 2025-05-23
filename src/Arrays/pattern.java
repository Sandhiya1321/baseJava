package Arrays;

public class pattern {
    public static void main(String[] args) {
        int n=1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j||j==1&&i==3||i==4&&j==2||i==5&&j==1||i==5&&j==3) {
                    System.out.print(n);
                    n++;
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();

        }
    }
}