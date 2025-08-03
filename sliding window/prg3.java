import java.util.HashMap;

public class prg3 {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String ans = findminmatch(s,t);
        System.out.println(ans);
    }

    static String findminmatch(String s,String t){
        HashMap<Character,Integer> tmap = new HashMap<>();
        for(char c:t.toCharArray()){
            tmap.put(c,tmap.getOrDefault(c, 0)+1);
        }
        HashMap<Character,Integer> wmap = new HashMap<>();
        int have = 0;
        int need = tmap.size();
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int resStart = 0;
        for(int end=0;end<s.length();end++){
            char c = s.charAt(end);
            wmap.put(c,wmap.getOrDefault(c,0)+1);
            if(tmap.containsKey(c) && wmap.get(c).equals(tmap.get(c))){
                have++;
            }
            while(have==need){
                  // 1. Update minimum window if smaller
    if (end - start + 1 < minLen) {
        minLen = end - start + 1;
        resStart = start;
    }

    // 2. Shrink window from the left
    char leftChar = s.charAt(start);
    wmap.put(leftChar, wmap.get(leftChar) - 1);

    // 3. If removing breaks requirement, reduce have
    if (tmap.containsKey(leftChar) && 
        wmap.get(leftChar) < tmap.get(leftChar)) {
        have--;
    }

    start++; // Move start right to shrink window
            }

        }
            return minLen == Integer.MAX_VALUE ? "" : s.substring(resStart, resStart + minLen);

       

    }
    
}
