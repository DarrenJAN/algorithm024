package src;
import java.util.ArrayList;
import java.util.List;

public class q22_generateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        helper(0,0, n , result,"");
        return result;
    }

    public void helper(int left, int right, int n, List<String> stringList, String stringBuilder)
    {
        if(left == n && right == n)
        {
            stringList.add(new String(stringBuilder));
            return;
        }

        if(left <n)
        {
            helper(left+1, right, n, stringList, stringBuilder+"(");
        }

        if(right < left)
        {
            helper(left, right + 1, n , stringList, stringBuilder + ")");
        }


    }
}
