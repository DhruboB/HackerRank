package strings;

public class GameOfThrones {

    public static void main(String[] args) {
//        String s = "cdcdcdcdeeeef";
        String s = "cdefghmnopqrstuvw";

        System.out.println(gameOfThrones(s));
    }


    // Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {
        String YES = "YES";
        String NO = "NO";
        if(s == null || s.length() == 0) return YES;
        int len = s.length();
        int[] counts = new int[26];

        for (int i = 0; i < len; i++) {
            counts[s.charAt(i) - 'a']++;
        }

        boolean isDoubleOneChar = false;
        boolean isPalidrom = true;
        for (int i = 0; i < 26; i++) {
            int count = counts[i];
            if (count != 0 && count % 2 == 1) {
                if (isDoubleOneChar) {
                    return NO;
                } else {
                    isDoubleOneChar = true;
                }
            }
        }
        return isPalidrom ? YES : NO;
    }
}
