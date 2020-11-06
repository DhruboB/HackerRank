package interview.warmup;

public class RepeatedString {

    public static void main(String[] args) {
        String s = "aba";
        int n = 10;

        System.out.println(repeatedString(s,n));
    }

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long countOfAInString = 0;
        if(n <= s.length()){
            return countAInStr(s,n);
        }

        countOfAInString = countAInStr(s,s.length());
        countOfAInString *= n / s.length() ;
        long rem = n % s.length() ;
        countOfAInString += countAInStr(s,rem);

        return countOfAInString;
    }

    private static long countAInStr(String s, long tillN ){
        long countOfAInString = 0;
        for(int i = 0; i < tillN ; i++){
            if(s.charAt(i) == 'a'){
                countOfAInString++;
            }
        }
        return countOfAInString;
    }
}
