public class str11 {
    public static void main(String[] args) {
        String s1 = "abcfji";
        String s2 = "fba";
        Boolean ans = subseq(s1,s2);
        System.out.println(ans);

    }

    private static boolean subseq(String s1,String s2){
        int i = 0;
        int j = 0;
        while(j<s2.length() && i<s1.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                j++;
            }
            i++;
        }
        if(j<s2.length()){
            return false;
        }
        return true;
    }
    
}
