public class str10 {
    public static void main(String[] args) {
        String s = " a b ";
        String ans = remove(s);
        System.out.println(ans);
        
        
    }

    private static String remove(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) != s.charAt(i-1)){
                sb.append(s.charAt(i-1));

            }

        }
        sb.append(s.charAt(s.length()-1));
        return new String(sb);
    }
    
}
