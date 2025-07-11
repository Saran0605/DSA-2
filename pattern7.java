public class pattern7 {
    public static void main(String[] args) {
        int n = 4;
        n=2*n;
        for(int row=0;row<=n;row++){
            for(int col = 0;col<=n;col++ ){
                int printer = Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(4-printer+" ");
            }
            System.out.println();
        }
    }
    
}
