package Recursion01;

public class NumberExample {
    public static void main(String[] args) {
        //we only need to call one function and print all
        // if n = 1 =>  1 2 3 4 5
        print(1);
    }
    static void print(int n){
        if(n>5){
            return;
        }

        System.out.println(n);

        print(n + 1);
    }
}
