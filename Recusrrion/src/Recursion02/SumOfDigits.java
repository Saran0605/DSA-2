package Recursion02;

public class SumOfDigits {
    public static void main(String[] args) {
        int sum = findSum(12345);
        System.out.println(sum);

    }
    static int findSum(int n){
        if(n==0){
            return 0;
        }
        return n%10 + findSum(n/10);

        //for product
//        if(n%10==n){
//            return n;
//        }
//        return n%10 * findSum(n/10);
    }
}
