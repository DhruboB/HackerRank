package interview.warmup;

public class JumpingOnTheClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jump = 0;
        for(int i=0 ; i < c.length ; i++){
            if( i < c.length - 2 && c[i+2] == 0){
                jump++;
                i++;;
                continue;
            }
            if(i < c.length - 1 && c[i+1] == 0){
                jump++;
            }
        }
        return jump;
    }
}
