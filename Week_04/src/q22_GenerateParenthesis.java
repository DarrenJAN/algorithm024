package src;

import java.util.ArrayList;
import java.util.List;

public class q22_GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        dfs(result, 0,0 ,n, "");
        return result;
    }

    public void dfs(List<String> result, int left, int right, int n, String string)
    {
        if(string.length() == 2 * n)
        {
            result.add(string);
        }

        if(left < n)
        {
            dfs(result, left+1, right, n,string+ "(");
        }

        if(left > right)
        {
            dfs(result, left, right+1, n,string+")");
        }
    }

}
