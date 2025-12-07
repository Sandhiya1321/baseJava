package Number_system;

public class decimalToBinary {
        public static void main(String[] args) {
            int decimal = 53;
            StringBuilder binary = new StringBuilder();

            while (decimal > 0) {
                binary.insert(0, decimal % 2);
                decimal /= 2;
            }

            System.out.println("Binary value: " + binary);
        }
    }