import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class day63_longestValidParentheses {
    //stack
    public int longestValidParentheses(String s) {
        Stack<Integer> stack  = new Stack<>();
        stack.push(-1); // 方便计算
        int result = 0;
        for(int i = 0; i<s.length();i++)
        {
            if(s.charAt(i) == '(')
            {
                stack.push(i);
            }else
            {
                stack.pop();
                if(stack.isEmpty())
                {
                    stack.push(i);
                }else
                {
                    result = Math.max(result, i - stack.peek());
                }
            }
        }
        return result;
    }
}
