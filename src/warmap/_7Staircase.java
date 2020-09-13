package warmap;

public class _7Staircase {

    public static void main(String[] args) {
        int stairHeight = 6;
        for(int i =0 ; i < stairHeight ; i++ ){
            for(int j =0 ; j < stairHeight ; j++ ){
                if(stairHeight - 1 - i <= j) {
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
