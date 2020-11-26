package interview;

public class SherlockAndAnagrams {

    public static void main(String[] args) {
//        String s = "abba";
//        String s = "kkkk";
        String s = "ifailuhkqq";
        System.out.println(sherlockAndAnagrams(s));

    }

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        int len = s.length();
        int count = 0;
        for(int l = 1; l <= len ;  l++) {
            for (int i = 0; i < len; i++) {
                for (int j = i + 1; j < len && i+l <= len && j+l <= len ; j++) {
                    String str1 = s.substring(i, i + l);
                    String str2 = s.substring(j, j + l);
                    if (isAnagram(str1, str2)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private static boolean isAnagram(String str1, String str2){
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        if(str1.length() != str2.length()) return false;
        for(char c : str1.toCharArray()){
            count1[c - 'a']++;
        }
        for(char c : str2.toCharArray()){
            count2[c - 'a']++;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(count1[i] != count2[i]) return false;
        }
        return true;
    }
}
