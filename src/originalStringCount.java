import java.util.ArrayList;
public class originalStringCount {
    public int originalString(String word) {
        ArrayList<String> list = new ArrayList<>();
        list.add(word);
        for (int i = 0; i < word.length(); i++) {
            StringBuilder sb = new StringBuilder(word);
            sb.deleteCharAt(i);
            String letter = sb.toString();
            boolean isList = true;
            for (String s : list) {
                if (s.equals(letter)) {
                    isList = false;
                    break;
                }
            }
            if (isList) {
                list.add(letter);
            }
        }
        return list.size();
    }
    public static void main(String[] args) {
        originalStringCount sol = new originalStringCount();
        String word = "abbcccc";
        System.out.println(sol.originalString(word));
    }
}