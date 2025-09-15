public class FindXor {
    public static void main(String[] args) {
//        //for 0 to n
//        int a = 9;
//        System.out.println(xor(a));
        // if range xor a,b
        int a = 3;
        int b = 9;
        int ans = xor(b) ^ xor(a-1);
        System.out.println(ans);
        // if we use loops for long number will produce TLE
        //  so this is correct

    }
    public static int xor(int n){
        if(n%4==0){
            return n;
        }
        if(n%4==1){
            return 1;
        }
        if(n%4==2){
            return n+1;
        }
        return 0;
    }
}
