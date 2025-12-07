package Number_system;

public class binarytoHexadecimal {
        public static void main(String[] args) {
            String binary = "101101";
            //to decimal
            int decimal = 0, power = 0;
            for (int i = binary.length() - 1; i >= 0; i--) {
                if (binary.charAt(i) == '1') {
                    decimal += Math.pow(2, power);
                }
                power++;
            }
            //decimal to hexadecimal
            StringBuilder hexadecimal = new StringBuilder();
            char[] hexChars = "0123456789ABCDEF".toCharArray();

            while (decimal > 0) {
                hexadecimal.insert(0, hexChars[decimal % 16]);
                decimal /= 16;
            }

            System.out.println("Hexadecimal value: " + hexadecimal);
        }
    }