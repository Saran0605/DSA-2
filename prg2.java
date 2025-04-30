public class prg2 {
     public static void main(String[] args) {
        String name = "Saran";
        char target = 's';

        System.out.println(strsearch(name,target));
     }

     static boolean strsearch(String name,char target){
        if(name.length()==0){
            return false;
        }
       /*  for(int i = 0;i<name.length();i++){
            if(target==name.charAt(i)){
                return true;
            }
        } */

        for(char ch:name.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
     }
}
