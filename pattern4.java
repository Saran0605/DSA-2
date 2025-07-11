public class pattern4 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=2*n-1;i++){
            int colsend = i>n ? n - (i-n):i;
            for(int j=1;j<=colsend;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
     
}
