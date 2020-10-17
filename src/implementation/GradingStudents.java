package implementation;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static void main (String... args){
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        List<Integer> result = gradingStudents(grades);
        for(Integer v: result){
            System.out.println(v);
        }
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        if(grades == null || grades.size() == 0){
            return grades;
        }
        for(int i = 0 ; i < grades.size(); i++){
            if( grades.get(i) >= 38){
                if( grades.get(i).intValue() % 5 > 2 ){
                    grades.set(i,grades.get(i) - grades.get(i).intValue()%5 + 5 );
                }
            }
        }
        return grades;
    }
}
