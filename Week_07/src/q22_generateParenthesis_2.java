package src;

import java.util.ArrayList;
import java.util.List;

public class q22_generateParenthesis_2 {
    public List<String> generateParenthesis(int n) {
        List<String> result  = new ArrayList<>();

        dfs(0,0, n, "", result);
        return result;
    }

    public void dfs(int left, int right, int n, String string, List<String> result)
    {
        if(string.length() == 2 * n)
        {
            result.add(new String(string));
            return;
        }

        if(left<n)
        {
            dfs(left +1, right, n, string + "(", result);
        }

        if(left >  right)
        {
            dfs(left, right+1, n, string+ ")", result);
        }

    }
}
