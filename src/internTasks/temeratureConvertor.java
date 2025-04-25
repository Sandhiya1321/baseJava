package internTasks;

import java.util.Scanner;
public class temeratureConvertor {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the temperature : ");
            double temperature = scanner.nextDouble();

            System.out.print("Enter the unit: ");
            char unit = scanner.next().charAt(0);
            if (unit == 'C' || unit == 'c') {
                double converted = Fahrenheit(temperature);
                displayResult(temperature, "Celsius", converted, "Fahrenheit");
            } else if (unit == 'F' || unit == 'f') {
                double converted = Celsius(temperature);
                displayResult(temperature, "Fahrenheit", converted, "Celsius");
            } else {
                System.out.println("Invalid unit. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
            }
        }
        public static double Fahrenheit(double celsius) {
            return (celsius * 9 / 5) + 32;
        }
        public static double Celsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }
        public static void displayResult(double Temp, String Unit, double convertedTemp, String convertedUnit) {
            System.out.printf("%.2f %s is equal to %.2f %s.%n", Temp,Unit, convertedTemp, convertedUnit);
        }
}