package stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class TaleOfTwoStacks {

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}

class MyQueue<T> {

    Stack<Integer> newStack = new Stack<>();
    Stack<Integer> oldStack = new Stack<>();

    public void enqueue(Integer data) {
        newStack.push(data);
    }

    public Integer dequeue() {
        shiftStack(); // shift elements from old to new
        return oldStack.isEmpty() ? null : oldStack.pop();
    }

    public Integer peek() {
        shiftStack();
        return oldStack.isEmpty() ? null : oldStack.peek();
    }

    private void shiftStack() {
        if (oldStack.isEmpty()) {
            while (!newStack.isEmpty()) {
                oldStack.push(newStack.pop());
            }
        }
    }
}