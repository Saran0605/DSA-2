public class OddEven {
    public static void main(String[] args) {
        int n = 67;
        if(check(n)){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }

    }

    private static boolean check(int n) {
        return (n & 1) == 1;
    }
}
