package implementation.medium;

import java.util.*;

public class ClimibingTheLeaderBoard {

    public static void main(String[] args) {
//        Integer[] ranks  = {100,100,50,40,40,20,10};
//        Integer[] scores = {5,25,50,120}; // 6 4 2 1

        Integer[] ranks  = {100,90,90,80,75,60};
        Integer[] scores = {50,65,77,90,102}; // 6 5 4 2 1

        List<Integer> ranked = Arrays.asList(ranks);
        List<Integer> player = Arrays.asList(scores);
        for(Integer val : climbingLeaderboard(ranked, player)) {
            System.out.print(val + " ");
        }
    }

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */
    // O(N + MlogN) N = # of ranks & M = # of scores
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        if(ranked == null){
            ranked  = new ArrayList<>();
            ranked.add(0);
        }
        List<Integer> playerRanks = new ArrayList<>();
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        Integer score = 0;
        Integer preVscore = ranked.get(0);
        rankMap.put(preVscore,rank);
        for(Integer i = 1 ; i < ranked.size(); i++){
            score = ranked.get(i);
            if(score < preVscore){
                rankMap.put(ranked.get(i),++rank);
            }else {
                rankMap.put(ranked.get(i), rank);
            }
            preVscore = score;
        }
        // search for player score or closest score in leader board for each given input
        for(Integer playerScore : player){
            Integer closestPrevScore = searchRanks(playerScore,ranked);
            Integer closestRank = rankMap.get(closestPrevScore);
            playerRanks.add(closestPrevScore > playerScore ?  ++closestRank : closestRank);
        }
        return playerRanks;
    }

    // doing a binary search
    private static Integer searchRanks(Integer score,List<Integer> ranked){
        int start = 0;
        int end = ranked.size() - 1;
        int mid = 0;
        Integer midValue = 0;
        while(start < end){
            mid = (start + end)/2;
            midValue = ranked.get(mid);

            if(score > midValue){
                end = mid - 1;
            }else if (score < midValue){
                start = mid + 1;
            }else{
                break;
            }
            midValue = ranked.get(start);
        }
        return midValue;
    }
}
