package sorting.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheFullCountingSort {

//    public static void main(String[] args) {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int[] loc = null;
//        String[] strs = null;
//        try {
//            int n = Integer.parseInt(bufferedReader.readLine().trim());
//            loc = new int[n];
//            strs = new String[n];
//            for(int i = 0 ; i < n; i++) {
//                String[] str = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//                loc[i] = Integer.parseInt(str[0]);
//                strs[i] = str[1];
//            }
//            sort(loc,strs);
//            bufferedReader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
//        String[][] arr = {{"0","ab"},{"0","ef"},{"6","cd"},{"6","gh"},{"0","ab"},{"1","or"},{"2","not"},{"0","ef"},{"0","ij"},{"0","to"},{"1","be"},{"4","ij"},{"4","that"},{"4","is"},{"4","the"},{"2","to"},{"3","be"},{"5","question"},{"6","cd"},{"6","gh"}};
        String[][] arr = {{"0","ab"},{"6","gh"},{"0","or"},{"1","or"},{"2","not"},{"4","ij"},{"2","to"},{"6","cd"},{"5","question"}};
//        int[] loc = {0,6,0,1,2,4,2,6,5};
        int[] loc = {0,6,0,6,4,0,6,0,6,0,4,3,0,1,5,1,2,4,2};
//        String[] strs = {"a","b","c","f","d"};
        String[] strs = {"ab","cd","ef","gh","ij","ab","cd","ef","jh","ij","that","be","to","be","question","or","not","is","to","the"};

        sort(loc,strs);
        System.out.println("- - - - - to be or not to be - that is the question - - - -");

    }

    static void sort(int[] loc, String[] strs){

        int max = Arrays.stream(loc).max().getAsInt();

        int[] temp = new int[max+1];
        StringBuilder[] tempStrns = new StringBuilder[max+1];
        for(int i=0; i < loc.length ; i++) {
            ++temp[loc[i]];
            if(temp[loc[i]] > 1){
                tempStrns[loc[i]].append(strs[i]);
            } else{
                if(i <= loc.length / 2) {
                    tempStrns[loc[i]] = new StringBuilder("-");
                }else {
                    tempStrns[loc[i]] = new StringBuilder(strs[i]);
                }
            }
            tempStrns[loc[i]].append(" ");
        }
        int counter = 0;
        for(int i=0; i < temp.length ; i++){
            if(temp[i] != 0){
                for(int j = 1 ; j <= temp[i]; j++) {
                    loc[counter] = i;
                    strs[counter++] = tempStrns[i].toString();
                }
            }
        }
        printArray(tempStrns);
    }


    static void printArray(int[] arr){
        for(int v: arr){
            System.out.print(v + " ");
        }
        System.out.println();
    }

    static void printArray(String[] arr){
        for(String v: arr){
            System.out.print(v + " ");
        }
        System.out.println();
    }

    static void printArray(StringBuilder[] arr){
        for(StringBuilder v: arr){
            if(v != null) {
                System.out.print(v.toString());
            }
        }
        System.out.println();
    }

}
