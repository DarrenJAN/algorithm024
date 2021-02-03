import java.util.Stack;

public class day10_remove_outer_parentheses {
    public String removeOuterParentheses(String S) {
        char[] chars = S.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int numofleft = 0;

        for(int i = 0 ; i< chars.length; i++)
        {
            if(chars[i] == '(')
            {
                if(numofleft != 0)
                {
                    stringBuilder.append(chars[i]);
                }
                numofleft ++;
            } else if(chars[i] == ')')
            {
                if(numofleft > 1 )
                {
                    stringBuilder.append(chars[i]);
                }
                numofleft --;
            }
        }
        return stringBuilder.toString();
    }
}
