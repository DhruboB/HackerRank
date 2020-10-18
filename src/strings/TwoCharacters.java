package strings;

import java.util.*;

public class TwoCharacters {

    public static void main(String[] args) {

        String str = "beabeefeab"; // > babfab
//        String str = "beabeefeabgafbfafaf";

//        TreeMap<String, String> tm = new TreeMap();
//        tm.put("bs","1");
//        tm.put("as","2");
//        tm.put("fs","3");
//        tm.put("ds","4");
//        for(String  key: tm.keySet()) {
//            System.out.println(tm.get(key));
//        }

//        Deque dq = new LinkedList();

//        System.out.println(alternate(str));

    }

    static int alternate(String s) {
        if(s.length() <= 1 )
            return 0;


        return 0;
    }

    static boolean validate(char[] chars){
        for(int i=0 ; i < chars.length - 3 ; i++){
            if(chars[i] != chars[i+2]) {
                return false;
            }
        }
        return true;
    }


}
