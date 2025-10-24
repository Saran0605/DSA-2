package Recursion04;

public class Triangle1 {
    public static void main(String[] args) {
        tri(4,0);

    }

    static void tri(int r,int c){
        if(r==0){
            return;
        }
        if(c < r){
            System.out.print("* ");
            tri(r,c+1);
        }else{
            System.out.println();
            tri(r-1,0);

        }

    }
}
