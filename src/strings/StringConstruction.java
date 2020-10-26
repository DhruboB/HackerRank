package strings;

public class StringConstruction {

    public static void main(String[] args) {
        String s = "abcabcd";
        System.out.println(stringConstruction(s));
    }

    // Complete the stringConstruction function below.
    static int stringConstruction(String s) {

        int len = s.length();
        int[] counts = new int[26];

        int cost = 0;
        for(int i=0; i < len ; i++){
            if(counts[s.charAt(i) - 'a'] == 0){
                cost++;
            }
            counts[s.charAt(i)-'a']++;
        }
        return cost;
    }
}
