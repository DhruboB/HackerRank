package strings;

import java.util.Arrays;

public class MakingAnagrams {

    public static void main(String[] args) {
        String s1 = "ajcd";
        String s2 = "bcef";

        System.out.println(makingAnagrams(s1,s2));
    }

    // Complete the makingAnagrams function below.
    static int makingAnagrams(String s1, String s2) {
        int count = 0 ;
        int len1 = s1.length();
        int len2 = s2.length();

        int shorterLength = len1 > len2 ? len2 : len1;
        int longerLength = len1 > len2 ? len1 : len2;

        String shorterStr = len1 > len2 ? s2 : s1;
        String longerStr = len1 > len2 ? s1 : s2;

        char[] arr = shorterStr.toCharArray();
        Arrays.sort(arr); // NlogN

        int[] counts = new int[26];
        // O(N)
        for(int i=0; i < shorterLength; i++){
            counts[arr[i] - 'a']++;
        }

//        O(M)
        for(int i = 0 ; i< longerLength; i++ ){
            if(searchBinary(arr, counts, len1, longerStr.charAt(i))){
                count++;
            }
        }

        return len1 + len2 - 2*count;
    }

    static boolean searchBinary(char[] arr , int[] counts, int len ,  char c){
        int start  =  0 ;
        int end  = len -1;
        int mid = start;
        while(start <= end ){
            mid = (start + end )/2;
            if(arr[mid] < c){
                start =  mid + 1;
            }else if(arr[mid] > c){
                end  = mid -1;
            }else{
                if(counts[ c - 'a'] >= 1){
                    counts[c - 'a']--;
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
