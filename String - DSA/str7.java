public class str7 {
    public static void main(String[] args) {
        String s = "a2b5c6";
        String res = expansion(s);
        System.out.println(res);
    }

    private static String expansion(String s){
        if(s==null || s.length()==0){
            return " ";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while(i<s.length()){
            char ch = s.charAt(i);
            i++;
            StringBuilder counter = new StringBuilder();
            while(i<s.length() && Character.isDigit(s.charAt(i))){
                counter.append(s.charAt(i));
                i++;
            }

            int count = Integer.parseInt(counter.toString());
            for(int j=0;j<count;j++){
                sb.append(ch);
            }

        }

        return new String(sb);

    }
    
}
