public class str6 {
    public static void main(String[] args) {
        String s = "abc";
        String res = compress(s);
        System.out.println(res);
    }
    private static String compress(String s){
        if(s==null || s.length()==0){
            return " ";
        }
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                sb.append(s.charAt(i-1));
                sb.append(count);
                count = 1;
            }
            
            
        }
        sb.append(s.charAt(s.length()-1));
        sb.append(count);
        return new String(sb);
    }
    
}
