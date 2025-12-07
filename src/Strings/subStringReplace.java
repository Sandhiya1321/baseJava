package Strings;

public class subStringReplace {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String substringToReplace = "World";
        String replacement = "Java";
        String mody=verify(originalString,substringToReplace,replacement);
        System.out.println(mody);
    }
    public static String verify(String org,String subString,String replace){
        if(!org.contains(subString)){
            return org;
        }
        return org.replaceAll(subString,replace);
    }
}
