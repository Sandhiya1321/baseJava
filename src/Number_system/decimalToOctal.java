package Number_system;

public class decimalToOctal {
        public static void main(String[] args) {
            int decimal = 53;
            StringBuilder octal = new StringBuilder();

            while (decimal > 0) {
                octal.insert(0, decimal % 8);
                decimal /= 8;
            }

            System.out.println("Octal value: " + octal);
        }
}
