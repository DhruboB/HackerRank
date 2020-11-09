package interview;

import java.util.HashMap;
import java.util.Map;

public class HashTablesRansomNote {

    public static void main(String[] args) {

    }

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] notes) {
        Map<String , Integer> map = new HashMap<>();
        Integer val = 0;
        for(String word : magazine){
            val = map.getOrDefault(word, 0);
            map.put(word,++val);
        }

        for(String note : notes){
            val = map.getOrDefault(note, 0);
            if( val == 0 ) {
                System.out.println("No");
                return;
            }else {
                map.put(note,--val);
            }
        }
        System.out.println("Yes");
    }
}
