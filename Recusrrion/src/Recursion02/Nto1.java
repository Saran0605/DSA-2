package Recursion02;

public class Nto1 {
    public static void main(String[] args) {
        fun(5);
    }
    //printing both
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.print(n +" ");
        fun(n-1);
        System.out.print(n + " ");
    }

    static void funrev(int n){
        if(n==0){
            return;
        }
        funrev(n-1);
        System.out.println(n);
    }
}
