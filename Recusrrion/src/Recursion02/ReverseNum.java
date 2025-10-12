package Recursion02;

public class ReverseNum {
    public static void main(String[] args) {
        way1(1234);
        System.out.println(sum);

    }
    //should be avoid this way no use of external variable use pure recurssion
    static int sum = 0;
    static void way1(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        way1(n/10);
    }


}
