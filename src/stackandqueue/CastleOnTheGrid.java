package stackandqueue;

import java.util.LinkedList;
import java.util.Queue;


/**
 * You are given a square grid with some cells open (.) and some blocked (X). Your playing piece can move along any row
 * or column until it reaches the edge of the grid or a blocked cell. Given a grid, a start and an end position,
 * determine the number of moves it will take to get to the end position.
 * For example, you are given a grid with sides  described as follows:
 *
 * ...
 * .X.
 * ...
 * Your starting position  so you start in the top left corner. The ending position is . The path is . It takes  moves
 * to get to the goal.
 *
 */
public class CastleOnTheGrid {

    public static void main(String[] args) {
//        String[] grid = {".X.",
//                         ".X.",
//                         "..."};
//        int startX = 0;
//        int startY = 0;
//        int goalX = 0;
//        int goalY = 2;

//        String[] grid = {"...",
//                         ".X.",
//                         ".X."};
//        int startX = 2;
//        int startY = 0;
//        int goalX = 2;
//        int goalY = 2;

//        String[] grid = {".X..",
//                         "....",
//                         "..X.",
//                         "...."};
//        int startX = 0;
//        int startY = 0;
//        int goalX = 1;
//        int goalY = 3;

        String[] grid = {".X..XX...X",
                "X.........",
                ".X.......X",
                "..........",
                "........X.",
                ".X...XXX..",
                ".....X..XX",
                ".....X.X..",
                "..........",
                ".....X..XX"};
        int startX = 9;
        int startY = 1;
        int goalX = 9;
        int goalY = 6; // 3

        System.out.println(minimumMoves(grid,startX,startY,goalX,goalY));
    }

    // Complete the minimumMoves function below.
    static int minimumMoves(String[] grid, int startX, int startY, int goalX, int goalY) {
        int move = 0;
        int x = startX;
        int y = startY;
        int[] xy = new int[3];
        Queue<int[]> queue = new LinkedList<>();

        boolean[][] isVisted = new boolean[grid.length][grid.length];
        boolean found = false;
        queue.add(new int[]{x,y,0});
        int prevX = -1;
        int prevY = -1;

        while(!queue.isEmpty()){
            xy = queue.remove();
            x = xy[0];
            y = xy[1];
            move = xy[2];
//            System.out.println(x + " " + y + " dist: " + move);
            if(x == goalX && y == goalY){
                found  = true;
                break;
            }
            if(x >= 0 && y >=0 && x < grid.length && y < grid.length && isVisted[x][y]){
                continue;
            }
            isVisted[x][y] = true;
            if(y-1>=0 && grid[x].charAt(y-1) != 'X' && !isVisted[x][y-1]) queue.add(new int[]{x,y-1, addMoveIfNotStraight(move,x,y,prevX, prevY, -1, y-1)});
            if(y+1 < grid.length && grid[x].charAt(y+1) != 'X' && !isVisted[x][y+1]) queue.add(new int[]{x,y+1, addMoveIfNotStraight(move,x,y,prevX, prevY, -1, y+1)});
            if(x-1>=0 && grid[x-1].charAt(y) != 'X' && !isVisted[x-1][y]) queue.add(new int[]{x-1,y, addMoveIfNotStraight(move,x,y,prevX, prevY, x-1, -1)});
            if(x+1 < grid.length && grid[x+1].charAt(y) != 'X' && !isVisted[x+1][y]) queue.add(new int[]{x+1,y, addMoveIfNotStraight(move,x,y,prevX, prevY, x+1, -1)});

            prevX = x;
            prevY = y;
        }
        return found ? move : -1 ;
    }

    // figuring out the straight line move , if not then add a move else, do not increment move
    static int addMoveIfNotStraight(int move, int x, int y, int prevX, int prevY, int nextX, int nextY){
        if(nextX != -1 && y == prevY) return move;
        if(nextY != -1 && x == prevX) return move;
        return ++move;
    }
}
