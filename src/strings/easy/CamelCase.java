package strings.easy;

public class CamelCase {

    public static void main(String[] args) {
        String s = "oneTowThreeTestThisIAmFine";
        int wordCount = 1;
        for(int i= 0; i < s.length() ; i++){
            int chr = s.charAt(i);
            if(chr >= 65 && chr <= 90 ){
                wordCount++;
            }
        }
        System.out.println(wordCount);
    }
}
