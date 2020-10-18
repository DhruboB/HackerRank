package implementation;

public class KaprekarNumbers {

    public static void main(String[] args) {
        int p = 0;
        int q =99999;

        kaprekarNumbers(p , q);

    }


    // Complete the kaprekarNumbers function below.
    static void kaprekarNumbers(int p, int q) {

        int start = p > q ? q : p;
        int end = p > q ? p : q;
        boolean flag =  false;
        for(int i = start ; i <= end ; i++){
            if(isKaprekarNumber(i)){
                System.out.print(i + " " );
                flag = true;
            }
        }
        if(!flag){
            System.out.println("INVALID RANGE");
        }
    }

    static boolean isKaprekarNumber(long num){
        if(num ==  1) return true;
        long pow = num * num;
        int lenOfPower = (""+pow).length();
        if(lenOfPower == 1) return false;
        long leftHalf = Long.parseLong((""+pow).substring(0,lenOfPower/2));
        long rightHalf = Long.parseLong((""+pow).substring(lenOfPower/2 , lenOfPower));
        return (leftHalf + rightHalf) == num ? true : false ;
    }
}
