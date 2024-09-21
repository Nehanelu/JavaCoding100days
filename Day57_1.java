import java.util.Stack;

class Day57_1 {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public Day57_1() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
 public void push(int x) {
        stack1.push(x);
    }
    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    // Returns whether the queue is empty
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

/**
 * Example usage:
 * MyQueue myQueue = new MyQueue();
 * myQueue.push(1);
 * myQueue.push(2);
 * System.out.println(myQueue.peek()); // returns 1
 * System.out.println(myQueue.pop());  // returns 1
 * System.out.println(myQueue.empty()); // returns false
 */
