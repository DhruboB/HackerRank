package implementation.medium;

public class ClimbingTheLeaderboard {
    public static void main(String[] args) {
//        int[] leaderBoard = new int[]{100,90,90,80,75,60};
        int[] leaderBoard = new int[]{100,100,50,40,40,20,10};
//          int[] leaderBoard = new int[0];
//        int[] aliceScore = new int[]{55, 65 , 77, 90,102};
                int[] aliceScore = new int[0];
//        int[] aliceScore = new int[]{5,25,50,120};
        int[] result = climbingLeaderboard(leaderBoard, aliceScore);
        for(int v: result){
                System.out.println(v);
        }
    }

    static int[] climbingLeaderboard(int[] scores, int[] alice){
//        scores  = IntStream.of(scores).distinct().toArray();
//        int rank =  scores.length + 1;
//        for(int i = alice.length -1 ; i >= 0 ; i++ ){
//            if(alice[i] > scores[i]){
//
//            }
//        }

//        if(scores == null || scores.length == 0){
//            for(int i = 0 ; i < alice.length; i++){
//                alice[i] = 1;
//            }
//            return alice;
//        }
//        if(alice == null || alice.length == 0){
//            return alice;
//        }

        int scoreIndex = 0; // score index
        int rank = 1;

        for (int x = alice.length - 1; x >= 0; x--) {
            if (scoreIndex == scores.length) {
                rank++;
                scoreIndex++;
            }
            while (scoreIndex < scores.length && scores[scoreIndex] > alice[x]) {
                if (!(scoreIndex < scores.length - 1 && scores[scoreIndex] == scores[scoreIndex + 1])) {
                    rank++;
                }
                scoreIndex++;
            }
            alice[x] = rank;
        }
        return alice;
    }

//    static int[] climbingLeaderboard(int[] scores, int[] alice){
//        List<Integer> ranks = new ArrayList<>();
//        int[] currentBoard  = IntStream.of(scores).distinct().toArray();
//        int currentRank = 0;
//        for(int score : alice){
//            currentRank = addScore(currentBoard, score);
//            ranks.add(currentRank);
//        }
//        int[] temp = new int[ranks.size()];
//        for(int i = 0 ; i < ranks.size(); i ++){
//            temp[i] = ranks.get(i);
//        }
//        return temp;
//    }

    static int addScore(int[] arr, int score){
        int[] currentBoard = arr;
        int rank =0;
        if(arr == null || arr.length == 0){
            arr[0] = score;
            rank = 1;
            return rank;
        }
        int[] temp = new int[arr.length + 1];
        int j = 0;
            if(score > arr[0]){
                rank++;
                temp[j++] = score;
                for(int v: arr){
                    temp[j++] = v;
                }
            }else if(score < arr[arr.length - 1]){
                for(int v: arr){
                    rank++;
                    temp[j++] = v;
                }
                temp[j++] = score;
                rank++;
            }else {
                for (int i = 0; i < arr.length - 1; i++) {
                    temp[j++] = arr[i];
                    if (score == arr[i]) {
                        rank = i +1;
                        break;
                    }
                    if (score > arr[i+1] && score < arr[i]){
                        rank = i + 2;
                        temp[j++] = score;
                    }
                }
            }
        return rank;
    }




    static int[] removeDuplicate(int[] arr){
        if(arr == null || arr.length == 1){
            return arr;
        }
        int[] temp = new int[arr.length];
        int j = 0;
        for(int i = 0 ; i < arr.length -1; i++){
            if(arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j] = arr[arr.length - 1];
        return temp;
    }


    static Result rank(int[] leaderBoard , int num){
        Result result = new Result();
        int rank = 0;
        int[] updatedLeaderBoard = new int[leaderBoard.length + 1];
        boolean isRanked = false;
        int counter = 0;
        int priorNum = 0;
        for(int i = 0 ; i < leaderBoard.length; i++){
            if(isRanked){
                updatedLeaderBoard[counter++] = leaderBoard[i];
                continue;
            }
            if( leaderBoard[i] < num ){
                updatedLeaderBoard[counter++] = num;
                updatedLeaderBoard[counter++] = leaderBoard[i];
                rank--;
                isRanked =  true;
            }else if(num == leaderBoard[i] ){
                while(i < leaderBoard.length - 1 && num == leaderBoard[i] ){
                    updatedLeaderBoard[counter++]=leaderBoard[i];
                    i++;
                    rank--;
                }
                updatedLeaderBoard[counter++] = num;
                isRanked =  true;
            }else{
                if(priorNum == leaderBoard[i]){
                    do{
                        updatedLeaderBoard[counter++]=leaderBoard[i];
                        i++;
                    }while(i + 1 < leaderBoard.length && priorNum == leaderBoard[i]);
                    rank--;
                }else {
                    if(leaderBoard.length - 1 == i) {
                        updatedLeaderBoard[counter++] = leaderBoard[i];
                        updatedLeaderBoard[counter++] = num;
                    }else{
                        updatedLeaderBoard[counter++] = leaderBoard[i];
                    }

                }
            }
                ++rank;
            priorNum = leaderBoard[i];
        }
        if(!isRanked){
            updatedLeaderBoard[counter++]=num;
            rank++;
        }
        result.currentRank = rank;
        result.currentBoard = updatedLeaderBoard;
        return result;
    }
}

class Result {
    int currentRank;
    int[] currentBoard;
}
