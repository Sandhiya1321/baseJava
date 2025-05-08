package Number_system;

public class hexadecimaltoOctal {
        public static void main(String[] args) {
            String hexadecimal = "35";
            int decimal = 0;

            // Convert hexadecimal to decimal
            for (int i = 0; i < hexadecimal.length(); i++) {
                char hexChar = hexadecimal.charAt(i);
                int value = Character.isDigit(hexChar) ? hexChar - '0' : hexChar - 'A' + 10;
                decimal = decimal * 16 + value;
            }

            // Convert decimal to octal
            StringBuilder octal = new StringBuilder();
            while (decimal > 0) {
                octal.insert(0, decimal % 8);
                decimal /= 8;
            }

            System.out.println("Octal value: " + octal);
        }

}
