package implementation;

public class JumpingOnTheCloudsRevisited {

    public static void main(String[] args) {

        int[] c  = {0, 0, 1, 0, 0, 1, 1, 0};
        int k = 2;

        System.out.println(jumpingOnClouds(c,k));

    }

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {
        int e  = 100;
        int n = c.length;
        int i = 0;
        while(true){
            i = (i + k)%n;
            e -= 1;
            if(c[i] == 1) e -= 2;
            if( i == 0 ) break;
        }
        return e;
    }
}
