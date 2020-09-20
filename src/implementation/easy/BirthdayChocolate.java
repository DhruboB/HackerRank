package implementation.easy;

import java.util.ArrayList;
import java.util.List;

public class BirthdayChocolate {

    public static void main(String[] args) {

        List<Integer> s = new ArrayList<>();
//        s.add(1);
//        s.add(2);
//        s.add(1);
//        s.add(3);
//        s.add(2);

//        s.add(1);
//        s.add(1);
//        s.add(1);
//        s.add(1);
//        s.add(1);
//        s.add(1);
//        int bday = 3;
//        int bmonth = 2;

//        4 5 4 5 1 2 1 4 3 2 4 4 3 5 2 2 5 4 3 2 3 5 2 1 5 2 3 1 2 3 3 1 2 5

//        s.add(4);
//        int bday = 4;
//        int bmonth = 1;

        s.add(4);
        s.add(5);
        s.add(4);
        s.add(5);
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(4);
        s.add(3);
        s.add(2);
        s.add(4);
        s.add(4);
        s.add(3);
        s.add(5);
        s.add(2);
        s.add(2);
        s.add(5);
        s.add(4);
        s.add(3);
        s.add(2);
        s.add(3);
        s.add(5);
        s.add(2);
        s.add(1);
        s.add(5);
        s.add(2);
        s.add(3);
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(3);
        s.add(1);
        s.add(2);
        s.add(5);
        int bday = 18;
        int bmonth = 6;


        System.out.println(birthday(s,bday, bmonth));

    }



    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int sum = 0;
        for(int i = 0 ; i < s.size() ; i++){
            if(i == 0) {
                for (int j = 0; j <  m; j++) {
                    sum += s.get(j);
                }
                if (sum == d) {
                    count++;
                }
                i += m - 1 ;
            } else {
                sum = sum + s.get(i) - s.get(i - m);
                if (sum == d) {
                    count++;
                }
            }
        }
        return count;
    }

}