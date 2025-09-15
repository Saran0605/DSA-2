public class FindAPowerB {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int base = 3;
        int ans = 1;
        while(b!=0){
            if((b&1) == 1){
                ans*=base;
            }
            base*=base;
            b = b>>1;

        }
        System.out.println(ans);
    }
}
