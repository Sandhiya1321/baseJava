package Number_system;

public class hexadecimalToBinary {
        public static void main(String[] args) {
            String hexadecimal = "35";
            int decimal = 0;

            // Convert hexadecimal to decimal
            for (int i = 0; i < hexadecimal.length(); i++) {
                char hexChar = hexadecimal.charAt(i);
                int value = Character.isDigit(hexChar) ? hexChar - '0' : hexChar - 'A' + 10;
                decimal = decimal * 16 + value;
            }

            // Convert decimal to binary
            StringBuilder binary = new StringBuilder();
            while (decimal > 0) {
                binary.insert(0, decimal % 2);
                decimal /= 2;
            }

            System.out.println("Binary value: " + binary);
        }
}
