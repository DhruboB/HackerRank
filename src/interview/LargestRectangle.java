package interview;

import java.util.Stack;

public class LargestRectangle {

    public static void main(String[] args) {
//        int[] heights = {1,2,3,4,5};
        int[] heights = {2,1,2};
        System.out.println(largestRectangle(heights));
    }

    // Complete the largestRectangle function below.
    static long largestRectangle(int[] h) {
        long maxArea = Long.MIN_VALUE;
        int count = 0;
        int height = -1;
        long area = -1;
        int top = -1;
        Stack<Integer> stack = new Stack<>();

        // storing index in stack to re-usue for calculation, we can get height value from input h array using index only
        while( count >= 0 && count < h.length){
            height = h[count];
            // if stack is empty or we find smaller height in stack compare to current building
            if(stack.isEmpty() || h[stack.peek()] < height){
               stack.push(count++);
            }else{
                top = stack.pop();
                area = h[top] * (stack.isEmpty() ? count : count - stack.peek() - 1);
                maxArea = Math.max(area,maxArea);
            }
        }
        // if stack is not empty at this point
        while(!stack.isEmpty()){
            top = stack.pop();
            area = h[top] * (stack.isEmpty() ? count : count - stack.peek() - 1);
            maxArea = Math.max(area,maxArea);
        }
        return maxArea ;
    }
}
