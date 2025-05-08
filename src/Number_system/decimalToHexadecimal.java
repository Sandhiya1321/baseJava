package Number_system;

public class decimalToHexadecimal {
    public static void main(String[] args) {
        int decimal = 53;
        StringBuilder hexadecimal = new StringBuilder();
        char[] hexChars = "0123456789ABCDEF".toCharArray();

        while (decimal > 0) {
            hexadecimal.insert(0, hexChars[decimal % 16]);
            decimal /= 16;
        }

        System.out.println("Hexadecimal value: " + hexadecimal);
    }
}
