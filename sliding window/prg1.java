//Longest Substring Without Repeating Characters
//sliding window + hashset
import java.util.*;
public class prg1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "bbbbbb";
        int ans = findLongSub(s);
        System.out.println(ans);
        
    }

    static int findLongSub(String s){
      Set<Character> list = new HashSet<>();
      int start = 0;
      int maxlen = 0;
      for(int end=0;end<s.length();end++){
        char c = s.charAt(end);

        while(list.contains(c)){
            list.remove(s.charAt(start));
            start++;
        }



        list.add(c);
        maxlen = Math.max(maxlen,end-start+1);

      }
      return maxlen;
      

    }
    
}
