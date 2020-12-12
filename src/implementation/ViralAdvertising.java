package implementation;

public class ViralAdvertising {

    public static void main(String[] args) {
        System.out.println(viralAdvertising(5));
    }

    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
        int likes = 0;
        int currLikes = 0;
        int people = 5;
        for(int i = 1; i <= n ; i++ ){
            currLikes = Math.floorDiv(people, 2);
            people =  currLikes * 3;
            likes += currLikes;
        }
        return likes;
    }
}
