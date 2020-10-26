package strings;

public class TwoStrings {

    public static void main(String[] args) {
        String s1 = "hi";
        String s2 = "world";

        System.out.println(twoStrings(s1,s2));
    }

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        int len1  = s1.length();
        int len2 = s2.length();

        String YES = "YES";
        String NO  = "NO";

        String shorter = len1 > len2 ? s2 : s1;
        String longer = len1 > len2 ? s1 : s2;

        int shortLen = len1 > len2 ? len2 : len1;
        int longLen = len1 > len2 ? len1 : len2;

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for(int i = 0; i < longLen ; i++){
            if(i < shortLen){
                count1[shorter.charAt(i) - 'a']++;
            }
            count2[longer.charAt(i) - 'a']++;
        }
        for(int i=0 ; i < 26 ; i++){
            if(count1[i] > 0 && count2[i] > 0){
                return YES;
            }
        }
        return NO;
    }
}
