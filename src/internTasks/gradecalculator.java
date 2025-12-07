package internTasks;
import java.util.Scanner;
public class gradecalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of grades to be entered: ");
            int numberOfGrades = scanner.nextInt();

            double sum = 0;
            for (int i = 1; i <= numberOfGrades; i++) {
                System.out.print("Enter grade " + i + ": ");
                double grade = scanner.nextDouble();
                sum += grade;
            }
            double average = sum / numberOfGrades;
            System.out.printf("The average grade is: %.1f%n", average);
        }
    }

