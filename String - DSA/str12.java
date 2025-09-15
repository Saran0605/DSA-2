import java.util.*;

public class str12 {
    public static List<Integer> search(String text, String pattern) {
        List<Integer> res = new ArrayList<>();
        if (pattern.isEmpty()) { res.add(0); return res; }
        int n = text.length(), m = pattern.length();
        int[] lps = buildLPS(pattern);

        int i = 0, j = 0; // i for text, j for pattern
        while (i < n) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++; j++;
                if (j == m) {
                    res.add(i - j);      // match found at i-j
                    j = lps[j - 1];      // continue searching
                }
            } else {
                if (j > 0) j = lps[j - 1];
                else i++;
            }
        }
        return res;
    }

    private static int[] buildLPS(String p) {
        int m = p.length();
        int[] lps = new int[m];
        int len = 0; // length of previous longest prefix-suffix
        int i = 1;
        while (i < m) {
            if (p.charAt(i) == p.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len > 0) len = lps[len - 1];
                else { lps[i] = 0; i++; }
            }
        }
        return lps;
    }

    public static void main(String[] args) {
        System.out.println(search("ababcabcabababd", "ababd")); // [10]
        System.out.println(search("aaaaa", "aa"));               // [0,1,2,3]
        System.out.println(search("abc", "abcd"));               // []
    }
}
