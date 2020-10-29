package implementation;

import java.math.BigInteger;

public class ExtraLongFactorials {

    public static void main(String[] args) {
        int n =  30;
        extraLongFactorials(n);
    }

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        BigInteger ans = new BigInteger("1");
        for(long i=1; i <= n ; i++ ){
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        System.out.println(ans);
    }
}
