import java.util.Arrays;

public class PrimesUptoN {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        Sieve(n,primes);
    }

    private static void Sieve(int n, boolean[] primes) {
        for(int i=2;i * i <= n;i++){
            if(!primes[i]){
                for(int j = i*2;j<=n;j+=i){
                    primes[j] = true;
                }
            }
        }
        for(int m=2;m< primes.length;m++){
            if(!primes[m]){
                System.out.print(m + " ");
            }
        }
    }
}
