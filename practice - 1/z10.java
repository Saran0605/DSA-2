public class z10 {
    public static void main(String[] args) {
        String s = "ab@cdabd";
        char ans = findchar(s);
        System.out.println(ans);
        
    }

    private static Character findchar(String s){
        int[] count = new int[256];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
        }
        for(int j=0;j<s.length();j++){
            if(count[s.charAt(j)]==1){
                return s.charAt(j);
            }
        }
        return null;

    }
    
}
