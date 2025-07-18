//check whether given string is palindrome
public class z9 {
    public static void main(String[] args) {
        String s = "a@ba";
        boolean res = checkpali(s);
        System.out.println(res);
        
    }
    private static boolean checkpali(String s){
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(!(Character.isAlphabetic((s.charAt(left))))){
                left++;
            }
            else if(!(Character.isAlphabetic((s.charAt(right))))){
                right--;
            }
            else if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
    
}
