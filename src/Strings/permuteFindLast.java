package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class permuteFindLast {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        System.out.println(permute(s));
    }

    public static String permute(String s) {
        List<String> ans = new ArrayList<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = s.substring(i, j);
                if (!ans.contains(sub)) {
                    ans.add(sub);
                }
            }
        }
        Collections.sort(ans);
        return ans.toString();
    }
}
