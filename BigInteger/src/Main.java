import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        int a = 30;
        int b = 67;

        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(345678934);

        //concerting biginteger to int value
        int c = B.intValue();


        //for string use new constructor calling
        // can be used like a number
        BigInteger C = new BigInteger("2345678");


        //constants
        BigInteger D = BigInteger.TEN;

        //addition
        BigInteger s = A.add(B);
        System.out.println(s);

        //methods
        // C.add(X)
        // C.multiply(X)
        // C.subtract(X)
        // C.divide(X)
        // C.remainder(X)


        //there is BigDecimal for precision more than normal decimal

        BigDecimal one = new BigDecimal("0.03");
        BigDecimal two = new BigDecimal("0.04");
        BigDecimal ans = one.add(two);
        System.out.println(ans);




    }
}