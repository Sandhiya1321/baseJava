package internTasks;

import java.util.Scanner;

public class passStrength {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your password:");
        String password=scan.nextLine();
        int score=passwordCheck(password);
        if(score<3){
            System.out.println("your score is:"+score+ " weak password :Consider of adding lowercase,uppercase words,numbers and special characters and make it long to increase the score");
        }
        else if(score==3||score==5){
            System.out.println("your score is:"+score+" Moderate password decent ,but can be improved for greater security");
        }
        else{
            System.out.println("your score is:"+score+" Strong password.Your password is secure");
        }

    }
public static int passwordCheck(String password){
        int score=0;
        if(password.length()>=8){
            score++;
        }
        if(password.matches(".*[a-z].*")){
            score++;
        }
        if(password.matches(".*[A-Z].*")){
            score++;
        }
        if(password.matches(".*[0-9].*")){
            score++;
        }
        if(password.matches(".*[!@#$%^&*()_+-=,.<>/?|]")){
            score++;
        }
        return score;
}
}
