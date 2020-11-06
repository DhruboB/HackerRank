package interview.warmup;

public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int level  = 0 ;
        int countValley  = 0;
        boolean valleyFlag = false;
        for(char c : path.toCharArray()){
            if(c == 'D'){
                level -= 1;
            }else if(c == 'U'){
                level += 1;
            }
            if( !valleyFlag && level < 0 ){
                countValley++;
                valleyFlag = true;
            }
            if( valleyFlag && level == 0 ){
                valleyFlag = false;
            }
        }
        return countValley;
    }
}
