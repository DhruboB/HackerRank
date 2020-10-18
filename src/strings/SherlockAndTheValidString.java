package strings;

import java.util.Arrays;

public class SherlockAndTheValidString {

    public static void main(String... args) throws InvalidInputException {

        String s = "abcdefghhgfedecba" ;
//        String s = "cdffffaabbcd" ;
        System.out.println(isValid(s));
    }


    static String isValid(String s) throws InvalidInputException {

        String YES = "YES";
        String NO = "NO";
        int MAX_INDEX_POS = 127;
        if(s.isEmpty() ) return NO;
        if(s.length() < 3) return YES;

        int[] charCount = new int[128];
        for(int i = 0; i < s.length(); i++){
            ++charCount[s.charAt(i)] ;
        }
        Arrays.sort(charCount);
        int i=0;
        while(charCount[i]==0){
            i++;
        }
        if(charCount[i] == charCount[MAX_INDEX_POS]) {
            return YES;
        }
        if(((charCount[MAX_INDEX_POS]-charCount[i])==1 && (charCount[MAX_INDEX_POS] > charCount[MAX_INDEX_POS-1]))
                || (charCount[i] == 1) && (charCount[i+1] == charCount[MAX_INDEX_POS])) {
            return YES;
        }
        return NO;
    }

    static class InvalidInputException extends Exception {

    }
}
