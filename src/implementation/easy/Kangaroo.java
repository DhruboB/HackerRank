package implementation.easy;

public class Kangaroo {

    public static void main(String... args){
        System.out.println(kangaroo(0,3,4,2));
        System.out.println(kangaroo(0,2,5,3));
        System.out.println(kangaroo(0,7,0,3));

    }

    static String kangaroo(int x1, int v1, int x2, int v2) {
        int counter = 1;
        if (x1 > x2 ){
            x1 = x1 + x2;
            x2 = x1 - x2;
            x1 = x1 - x2;
            v1 = v1 + v2;
            v2 = v1 - v2;
            v1 = v1 - v2;
        }
        while(true){
            int dist1 = x1+v1*counter;
            int dist2 = x2+v2*counter;
            if( dist1 == dist2){
                return "YES";
            }
            if ( dist1 > dist2 ){
                break;
            }
            counter++;
        }
        return "NO";
    }
}
