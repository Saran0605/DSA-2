public class str8 {
    public static void main(String[] args) {
        String[] arr = {"land","let"};
        String ans = findprefix(arr);
        System.out.println(ans);
    }

    private static String findprefix(String[] arr){
        StringBuilder sb = new StringBuilder(arr[0]);
        for(int i=1;i<arr.length;i++){
            int j = 0;
            while(j<sb.length() && j<arr[i].length()){
                if(sb.charAt(j) != arr[i].charAt(j)){
                    sb.delete(j,sb.length());
                    break;
                }
                j++;
            }
            

        }
        return new String(sb);

    }
    
}
