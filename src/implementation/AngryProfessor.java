package implementation;

public class AngryProfessor {

    public static void main(String[] args) {
//        int[] times = {-93,-86,49,-62,-90,-63,40,72,11,67};
//        int k = 4; // NO
//        int[] times = {23,-35,-2,58,-67,-56,-42,-73,-19,37};
//        int k = 10; // YES
//        int[] times = {13,91,56,-62,96,-5,-84,-36,-46,-13};
//        int k = 8;

//        int[] times = {26,94,-95,34,67,-97,17,52,1,86};
//        int k = 7; // YES
        int[] times = {19,29,-17,-71,-75,-27,-56,-53,65,83};
        int k = 10; // NO
        System.out.println(angryProfessor(k,times));
    }

    // Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {
        String YES = "YES";
        String NO = "NO";
        int onTimeStudents = 0;
        for(int arrivalTime : a){
            if(arrivalTime <= 0 ){
                onTimeStudents +=1;
            }
        }
        return onTimeStudents >= k ? NO : YES;
    }

}
