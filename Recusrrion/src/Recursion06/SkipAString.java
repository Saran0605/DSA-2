package Recursion06;

public class SkipAString {
    public static void main(String[] args) {
        skipApple1("","sappleran");
        System.out.println(skipApple2("sappleran"));

    }

    static void skipApple1(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);



        if(up.startsWith("apple")){
            skipApple1(p,up.substring(5));
        }
        else{
            skipApple1(p+ch,up.substring(1));
        }
    }

    //now this method will return the processed string

    static String skipApple2(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);

        if(up.startsWith("apple")){
            return   skipApple2(up.substring(5));
        }
        else{
            return ch + skipApple2(up.substring(1));
        }
    }
}
