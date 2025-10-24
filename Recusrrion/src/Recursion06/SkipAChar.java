package Recursion06;

public class SkipAChar {
    public static void main(String[] args) {
        System.out.println(skipChar1("baccad",'a',"",0));
        skipChar2("","baccad");
        System.out.println(skipChar3("baccad"));

    }
    //using iterator method not recommended as bcoz ditto of the iteration bro... make use of recurssion in a better way
    static String skipChar1(String s,char target,String ans,int i){
        if(i == s.length()){
            return ans;
        }
        if(s.charAt(i)!=target){
            ans+=s.charAt(i);
        }

        return skipChar1(s,target,ans,i+1);
    }

    //this method will print when the unprocessd is empty, no iterator means we have strng methos

    static void skipChar2(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            skipChar2(p,up.substring(1));
        }
        else{
            skipChar2(p+ch,up.substring(1));
        }
    }

    //now this method will return the processed string

    static String skipChar3(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);

        if(ch == 'a'){
            return   skipChar3(up.substring(1));
        }
        else{
            return ch + skipChar3(up.substring(1));
        }
    }

}
