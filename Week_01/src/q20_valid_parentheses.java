import java.util.Stack;

public class q20_valid_parentheses {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> characterStack = new Stack<>();
        for(int i = 0; i<chars.length;i++)
        {
            if(chars[i] == '(' ) characterStack.add('(');
            else if (chars[i] == '{') characterStack.add('{');
            else if (chars[i] == '[') characterStack.add('[');
            else if (chars[i] == ')')
            {
                if(characterStack.empty()) return false;
                else{
                    if( characterStack.peek() == '(')
                        characterStack.pop();
                    else
                        return false;
                }
            }else if(chars[i] == ']')
            {
                if (characterStack.empty())return false;
                else
                {
                    if(characterStack.peek() == '[')
                        characterStack.pop();
                    else
                        return false;
                }
            }else if(chars[i] == '}')
            {
                if(characterStack.empty()) return false;
                else
                {
                    if(characterStack.peek() == '{')
                        characterStack.pop();
                    else
                        return false;
                }
            }
        }

        if(characterStack.empty())
            return true;
        else
            return false;
    }

    public boolean isValid2(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> characterStack = new Stack<>();
        for(int i = 0; i< chars.length;i++)
        {
            if( chars[i] == '(' )
            {
                characterStack.add(')');

            } else if(chars[i] == '[' ) characterStack.add(']');
            else if(chars[i] == '{') characterStack.add('}');

            else if( characterStack.empty() || characterStack.pop() !=  chars[i])
            {
                return false;
            }
        }
        return characterStack.empty();
    }
}
