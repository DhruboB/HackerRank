package warmap;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class _2CompareTheTriplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> score =  new ArrayList<>();
        int aliceScore = 0;
        int bobScore = 0;
        int index = 0;
        while ( index < a.size()){
            if (a.get(index) > b.get(index)) {
                aliceScore++;
            }
            if (a.get(index) < b.get(index)) {
                bobScore++;
            }
            index++;
        }
        score.add(aliceScore);
        score.add(bobScore);
        return score;
    }

    public static void main(String[] args) throws IOException {

        List<Integer> a = Arrays.asList(17,28,30);
        List<Integer> b = Arrays.asList(99,16,8);

        List<Integer> result = compareTriplets(a, b);

        System.out.println(result);
    }
}
