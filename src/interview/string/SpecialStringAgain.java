package interview.string;

public class SpecialStringAgain {

    public static void main(String[] args) {

    }

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        long retVal  = s.length();
        for(int i = 0 ; i < s.length(); i++){
            char startChar = s.charAt(i);
            int diffCharIdx = -1;
            for(int j = i+1 ; j <s.length() ; j++){
                char currChar = s.charAt(j);
                if(startChar == currChar){
                    if(diffCharIdx == -1 ||
                            (j - diffCharIdx) == (diffCharIdx - i)){
                        retVal++;
                    }
                }else {
                    if(diffCharIdx == -1){
                        diffCharIdx = j;
                    }else{
                        break;
                    }
                }
            }
        }
        return retVal ;
    }
}
