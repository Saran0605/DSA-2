import java.util.*;
public class str4{
    public static void main(String[] args) {
        String s = "hello world";
        printfreq(s);
    }

    private static void printfreq(String s){
        Set<Character> list = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int vow = 0;
        int cons = 0;
        for(int i=0;i<s.length();i++){
            if(list.contains(s.charAt(i))){
                vow++;
            }
            else{
                cons++;
            }
        }
        System.out.println(vow + " " + cons);

    }

}