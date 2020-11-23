package interview.string;

public class MakingAnagrams {

    public static void main(String[] args) {

    }

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int[] acounts = new int[26];
        int[] bcounts = new int[26];

        for(int i = 0 ; i < a.length(); i++){
            acounts[a.charAt(i)- 'a']++;
        }
        for(int i = 0 ; i < b.length(); i++){
            bcounts[b.charAt(i) - 'a']++;
        }
        int sum  = 0;
        for(int i=0; i < 26 ; i++){
            sum += Math.abs(acounts[i] - bcounts[i]);
        }
        return sum;
    }
}
