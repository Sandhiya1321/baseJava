package Number_system;

public class binarytoOctal {
        public static void main(String[] args) {
            String binary = "110101";
            //binary to decimal
            int decimal = 0, power = 0;
            for (int i = binary.length() - 1; i >= 0; i--) {
                if (binary.charAt(i) == '1') {
                    decimal += Math.pow(2, power);
                }
                power++;
            }
//decimal to octal
            StringBuilder octal = new StringBuilder();
            while (decimal > 0) {
                octal.insert(0, decimal % 8);
                decimal /= 8;
            }

            System.out.println("Octal value: " + octal);
        }
    }
