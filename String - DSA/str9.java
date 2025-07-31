public class str9{
    public static void main(String[] args) {
        String s = "SaRaN";
         String ans = convert(s);
         System.out.println(ans);
    }

    private static String convert(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            int num = s.charAt(i);
            if(num>=65 && num<=90){
                int c = s.charAt(i) + 32;
                sb.append((char)c);
                
                
            }
            else{
                int d = s.charAt(i) - 32;
                sb.append((char)d);


            }
        }
        return new String(sb);
    }
}