import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> stack_min;
    int min = Integer.MAX_VALUE;

    public MinStack() {
        stack = new Stack<>();
        stack_min = new Stack<>();
    }

    public void push(int x) {
        if(stack.empty())
            min = x;
        else
            min = Math.min(x, stack_min.peek());

        stack_min.push(min);
        stack.push(x);

    }

    public void pop() {
        stack.pop();
        stack_min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return stack_min.peek();
    }
}
