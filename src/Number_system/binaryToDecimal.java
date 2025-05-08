package Number_system;

public class binaryToDecimal {
        public static void main(String[] args) {
            String binary = "1101";
            int decimal = 0;
            int pow = 0;
            for (int i = binary.length() - 1; i >= 0; i--) {
                if (binary.charAt(i) == '1') {
                    decimal += Math.pow(2, pow);
                }
                pow++;
            }

            System.out.println(decimal);
        }
    }

