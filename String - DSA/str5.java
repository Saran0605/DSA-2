public class str5 {
    public static void main(String[] args) {
         String str1 = "Listen";
         String str2 = "Silent";
         Boolean ans = checkAnag(str1,str2);
         System.out.println(ans);

    }
    private static boolean checkAnag(String str1,String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        int[] freq =  new int[26];
        for(int i=0;i<str1.length();i++){
            freq[str1.charAt(i) - 'a']++;
            freq[str2.charAt(i) - 'a']--;

        }

        for(int c:freq){
            if(c!=0){
                return false;
            }
        }

        return true;




    }
    
}
