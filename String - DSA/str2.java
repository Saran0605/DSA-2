public class str2 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        Boolean ans = checkpali(s.toLowerCase());
        System.out.println(ans);

    }
    private static boolean checkpali(String s){
        int start = 0;int end = s.length()-1;
        while(start<end){
            if(!(Character.isAlphabetic(s.charAt(start)))){
                start++;
            }
            else if(!(Character.isAlphabetic(s.charAt(end)))){
                end--;
            }
            else if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;

    }
    
}
