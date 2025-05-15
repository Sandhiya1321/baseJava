package TCS;

import java.util.Scanner;

public class calNoOfDays {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String day=scan.nextLine();
        int days=scan.nextInt();
        String[] weekDays={"sun","mon","tue","wed","thur","fri","sat"};
        int startIndex=0;
        for (int i = 0; i < weekDays.length; i++) {
            if(weekDays[i].equals(day.toLowerCase())){
                startIndex=i;
                break;
            }
        }
        int firstSunday=(7-startIndex)%7;
        int totSun=0;
        if (firstSunday < days) {
            totSun++;
        }

        totSun += (days - firstSunday) / 7;
        System.out.println(totSun);


    }
}
