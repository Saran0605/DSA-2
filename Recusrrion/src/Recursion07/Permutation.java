package Recursion07;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
//        permute("","abc");
        System.out.println(permuteList("","abc"));

    }

    static void permute(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        int len = p.length();

        for(int i=0;i<=len;i++){
            String f = p.substring(0,i);
            String s = p.substring(i,len);
            permute(f+ch+s,up.substring(1));
        }

    }

    static ArrayList<String> permuteList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        int len = p.length();

        ArrayList<String> list = new ArrayList<>();

        for(int i=0;i<=len;i++){
            String f = p.substring(0,i);
            String s = p.substring(i,len);
            list.addAll(permuteList(f+ch+s,up.substring(1)));
        }
        return list;

    }

}
