import java.util.HashMap;

public class prg2 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int len = findLongSub(s);
        System.out.println(len);
    }
    static int findLongSub(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        int start = 0;
        int maxlen = 0;
        for(int end=0;end<s.length();end++){
            char c = s.charAt(end);

            if(map.containsKey(c) && map.get(c)>=start){
                start = map.get(c)+1;

            }

            map.put(s.charAt(end),end);
                    maxlen = Math.max(maxlen,end-start+1);


        }
        return maxlen;


    }
    
}
