package Number_system;

public class replace0to1 {
    public static void main(String[] args) {
        String n = "90870121";
        String modifiedString = "";
        for (int i = 0; i < n.length(); i++) {
            char currentChar = n.charAt(i);
            if (currentChar == '0') {
                modifiedString += '1';
            }
            else if(currentChar=='1'){
                modifiedString+='0';
            }else {
                modifiedString += currentChar;
            }
        }
        System.out.println("Modified string: " + modifiedString);
    }
}