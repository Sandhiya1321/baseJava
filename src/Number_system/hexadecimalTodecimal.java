package Number_system;

public class hexadecimalTodecimal {
        public static void main(String[] args) {
            String hexadecimal = "2F"; // Example hexadecimal number
            int decimal = 0;

            // Convert hexadecimal to decimal
            for (int i = 0; i < hexadecimal.length(); i++) {
                char hexChar = hexadecimal.charAt(i);
                int value = Character.isDigit(hexChar) ? hexChar - '0' : hexChar - 'A' + 10;
                decimal = decimal * 16 + value;
            }

            System.out.println("Decimal value: " + decimal);
        }

}
