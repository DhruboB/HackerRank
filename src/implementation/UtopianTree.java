package implementation;

public class UtopianTree {

    public static void main(String[] args) {
        int[] inputs = {0,1,2,3,4,5,6};
        for(int i: inputs){
            System.out.println("For cycle "+ i +" > " + utopianTree(i));
        }
    }

    // Complete the utopianTree function below.
    static int utopianTree(int n) {
        if ( n <= 0) return 1;
        if ( n == 1) return 2;
        int height = 2;
        for(int i = 2 ; i <= n ; i++){
            if(i%2 == 0){
                height += 1;
            }else {
                height = 2*height;
            }
        }
        return height;
    }
}
