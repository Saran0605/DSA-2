public class pattern5 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=2*n-1;i++){
            int colsend = i>n ? n - (i-n):i;
            int spaces = i>n?i-n:n-i;
            for(int m=1;m<=spaces;m++){
                System.out.print(" ");
            }
            for(int j=1;j<=colsend;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
     
}
