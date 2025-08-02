//valid parantheses sum
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
public class prg4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "([)]";
        boolean ans = validpar(s);
        if(ans){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }


        
    }
    
    static boolean validpar(String s){
        Stack<Character> st = new Stack<>();
        HashMap<Character,Character> map = new HashMap<>();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else if(map.get(st.peek())== s.charAt(i)){
                    st.pop();

                }
                else{
                    return false;
                }
            }
        }
        System.out.println(st);
        return st.isEmpty();
        
    }
}
