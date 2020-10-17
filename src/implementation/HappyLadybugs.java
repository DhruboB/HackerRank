package implementation;

public class HappyLadybugs {

    public static void main(String[] args) {
//        G
//        GR
//        _GR_
//        _R_G_
//        R_R_R
//        RRGGBBXX
//        RRGGBBXY
//        NO
//        NO
//        NO
//        NO
//        YES
//        YES
//        NO
        String str = "AABCBC";
        System.out.println(happyLadybugs(str));
    }

    // Complete the happyLadybugs function below.
    static String happyLadybugs(String b) {
        String YES = "YES";
        String NO = "NO";

        // if provided string in null
        if(b == null) return YES;

        int size = b.length();
        int[] counts = new int[31];
        boolean isConsecutivePaired = false;

        // counting all the characters
        ++counts[b.charAt(0)  - 'A'];
        for(int i = 1 ;i< size ; i++){
            ++counts[b.charAt(i) - 'A'];
        }

        // if there re consecutive characters or not
        int left  = 0;
        int right  = 1;
        int counter = 1;
        loop:
        while(left < size && right < size){
            if(b.charAt(right) == b.charAt(left)) {
                isConsecutivePaired = true;
                counter++;
                right++;
            }else {
                left = right;
                left = left + 1;
                if(counter == 1) {
                    isConsecutivePaired = false;
                    break loop;
                }else {
                    counter = 1;
                }
            }
        }

        int noChar = 0;
        for(int i = 0; i < 26 ; i++){
            if(counts[i] == 1){
                return NO; // if there is any single character
            }
            if(counts[i] == 0){
                noChar++;
            }
        }

        // NO chars to be UNHAPPY then YES
        if(noChar == 26 ) return YES;

        // there is '_' and no single character present
        if(counts[30] > 0 ) return YES;

        // no _ and unpaired char then NO
        return counts[30] == 0 && !isConsecutivePaired ? NO : YES;
    }
}
