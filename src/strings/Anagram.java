package strings;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "mnop";

        System.out.println(anagram(s1));
    }

    // Complete the anagram function below.
    // O(N)
    static int anagram(String s) {
        int len = s.length();
        if(len%2 != 0) return -1;
        int change = 0;
        int[] s1Counts = new int[26];
        int[] s2Counts = new int[26];
        for(int i=0; i < len ; i++){
            if(i < len/2){
                s1Counts[s.charAt(i) - 'a']++;
            }else{
                s2Counts[s.charAt(i) - 'a']++;
            }
        }

        for(int i = 0 ; i < len ; i++){
            if(i < len/2){
                int s1Count = s1Counts[s.charAt(i) - 'a'];
                int s2Count = s2Counts[s.charAt(i) - 'a'];
                if(s1Count > 0 && s2Count > 0 ) {
                    s2Counts[s.charAt(i) - 'a']--;
                    s1Counts[s.charAt(i) - 'a']--;
                }
            }
        }
        for(int i = 0 ; i < 26 ; i++) {
            if(s1Counts[i] > 0 || s2Counts[i] > 0){
                change += s1Counts[i];
                change += s2Counts[i];
            }
        }

        return change/2;
    }
}
