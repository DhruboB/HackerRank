package extra;

public class Fibonaci {

    public static void main(String[] args) {
        int n = 0;
        System.out.print(returnFibNth(n));
        System.out.println("\nrecursive nth fibonocci is " + recursiveFibonaci(n));
    }

    static long returnFibNth(int n) {
        int i = 1;
        long currentNum = 0;
        long prevNum = 0;
        long sum = 1;
        while (i <= n) {
            if (i == 1 || i == 2) {
                currentNum = 1;
                prevNum = 1;
            } else {
                sum = prevNum + currentNum;
            }
            System.out.println( i + " number of the series is " + sum );
            prevNum = currentNum;
            currentNum = sum;
            i++;
        }
        return  currentNum;
    }

    static long recursiveFibonaci(int n){
        if(n == 0 || n == 1){
            return  n;
        }
        return recursiveFibonaci(n-1) + recursiveFibonaci(n-2);
    }
}
