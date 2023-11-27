import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

class SplitStack {
    public static void splitStack(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();

        while (!stack.isEmpty()) {
            int num = stack.pop();

            if (num < 0) {
                queue.add(num);
            } else {
                stack.push(num);
            }
        }

        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(5);
        stack1.push(-5);
        stack1.push(67);
        stack1.push(-45);
        stack1.push(67);
        stack1.push(9);
        stack1.push(0);
        stack1.push(-42);
        stack1.push(56);
        stack1.push(-7);

        System.out.println("Original Stack: " + stack1);
        splitStack(stack1);
        System.out.println("Split Stack: " + stack1);

    }
}