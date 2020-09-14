package performance;

import java.util.Date;

public class TestStringBuilder {

    public static void main(String[] args) {
        Date previousTime = new Date();
        String test = "";

//        for(int i=0 ; i < 100000; i++){
//            test += i;
//        }
//        printTimeDiff(previousTime);
//        System.out.println(test);

        StringBuilder sb = new StringBuilder(test);
        for(int i=0 ; i < 100000; i++){
            sb.append(i);
        }
        printTimeDiff(previousTime);
        System.out.println(sb.toString());
    }

    static void printTimeDiff(Date previousTime){
        Date current = new Date();
        long diff  = current.getTime() - previousTime.getTime();
        System.out.println( diff / 1000 );
    }

}
